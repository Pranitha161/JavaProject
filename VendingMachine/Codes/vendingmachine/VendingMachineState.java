package vendingmachine;
import java.util.*;
import coin.Coin;
import item.Item;
public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Currently machine is in idle state");
    }
    public void ClickOnStartProductSelectionButton(){
        System.out.println("Vending machine is in HasMoney State ");
    }
    public void insertCoin(VendingMachine vendingMachine,int coinvalue){
        System.out.println("Vending machine is in HasMoney State");
        System.out.println("Accepted the coin");
        Coin coin = getCoinByValue(coinvalue);
        if(coin==null){
            System.out.println("Invalid coin");
        }
        else
        vendingMachine.getCoinList().add(coin);
    }
    private Coin getCoinByValue(int coinvalue){
        for(Coin validcoin:Coin.values()){
            if(validcoin.getValue()==coinvalue){
                return validcoin;
            }
        }
        return null;
    }
    // public boolean isValidCoin(Coin coin){
    //     for(Coin validcoin:Coin.values()){
    //         if(validcoin==coin){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public List<Coin> refundfullMoney(VendingMachine vendingMachine){
        System.out.println("Returned the full amount back in the coin dispense tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();
    }
    public void updateInventory(VendingMachine vendingMachine,Item item,int itemCodeNumber){
        vendingMachine.getInventory().addItem(item,itemCodeNumber);
    }
    public void dispenseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        System.out.println("Currently vending machine is in Dispense State");
        System.out.println("Product has been dispense");
        vendingMachine.getInventory().updateSoldOutItem(itemCodeNumber);
        vendingMachine.setVendingMachineState(new VendingMachineState());
    }
    public void chooseProduct(VendingMachine vendingMachine,List<Integer> itemCodeNumber){
        int paidByUser=0;
        for(Coin coin: vendingMachine.getCoinList()){
            paidByUser+=coin.getValue();
        }
        for(int i=0;i<itemCodeNumber.size();i++){
        Item item=vendingMachine.getInventory().getItem(itemCodeNumber.get(i));
        if(item.getPrice()>paidByUser){
            refundfullMoney(vendingMachine);
            return;
        }
        else{
            paidByUser-=getChange(item.getPrice(),paidByUser);
            dispenseProduct(vendingMachine, itemCodeNumber.get(i));
        }
    }
    if(paidByUser>0){
        getChange1(paidByUser);
    }
    }
    public int getChange(int itemPrice,int paidByUser){
        
        return (paidByUser-itemPrice);
        
    }
    public void getChange1(int paidByUser){
        System.out.println("Retured the Change in the Coin Dispense tray "+(paidByUser));
    }

}
