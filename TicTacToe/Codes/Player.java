package player;
public class Player {
    private String name;
    private char symbol;
    private String address;
    private String contactNumber;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name,char symbol,String address,String contactNumber,String emailId,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactNumber=contactNumber;
        this.emailId=emailId;
        this.age=age;
    }
    public void setPlayerNameAndAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }
    public void setPlayerNumberSymbolEmailIdAge(String name,char symbol,String emailId,int age){
        this.name=name;
        this.age=age;
        this.emailId=emailId;
        this.symbol=symbol;

    }
    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }
    public void getPlayerDetails(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player symbol: "+this.symbol);
        System.out.println("Player Name: "+this.emailId);
        System.out.println("Player Name: "+this.address);
        System.out.println("Player Name: "+this.contactNumber);
        System.out.println("Player Name: "+this.age);
    }

}


