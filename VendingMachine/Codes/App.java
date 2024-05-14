import vendingmachine.*;

import java.util.*;

import item.*;
public class App {
    public static void main(String[] args) throws Exception {
       VendingMachine vendingMachine=new VendingMachine();
       System.out.println("Fill the Inventory");
       fillInvetory(vendingMachine);
       displayInventory(vendingMachine); 
       VendingMachineState vendingMachineState=vendingMachine.getVendingMachineState();
       vendingMachineState.insertCoin(vendingMachine,50);
       vendingMachineState.insertCoin(vendingMachine,50);
       vendingMachineState.insertCoin(vendingMachine,200);
       List<Integer> itemCodeNumber=new ArrayList<>();
       itemCodeNumber.add(102);
       itemCodeNumber.add(103);
       vendingMachineState.chooseProduct(vendingMachine, itemCodeNumber);
       displayInventory(vendingMachine);
    }
    private static void fillInvetory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfSlots=vendingMachine.getInventory().getInventory();
        for(int i=0;i<itemShelfSlots.length;i++){
            Item item=new Item();
            if(i==0||i==8){
                item.setItemType(ItemType.OREO);
                item.setPrice(30);   
            }
            else if(i==1||i==9){
                item.setItemType(ItemType.JUICE);
                item.setPrice(50);
            }
            else if(i==2){
                item.setItemType(ItemType.COKE);
                item.setPrice(20);
            }
            else if(i==3){
                item.setItemType(ItemType.SODA);
                item.setPrice(20);
            }
            else if(i==4){
                item.setItemType(ItemType.CHIPS);
                item.setPrice(25);
            }
            else if(i==5){
                item.setItemType(ItemType.CHOCOLATE);
                item.setPrice(10);
            }
            else if(i==6){
                item.setItemType(ItemType.CANDY);
                item.setPrice(30);
            }
            itemShelfSlots[i].setItem(item);
            itemShelfSlots[i].setSoldOut(false);
        }
    }
    private static void displayInventory(VendingMachine vendingMachine){
       ItemShelf[] itemShelfs=vendingMachine.getInventory().getInventory();
       for(ItemShelf shelf:itemShelfs){
        System.out.println("Item code "+shelf.getItemCode()+" Item Type"+shelf.getItem().getType()+"Item Price "+shelf.getItem().getPrice()+" isAvailable State "+ shelf.isSoldOut());
       }
    }
 
}



