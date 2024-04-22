package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactNo;
    String address;
    String emailID;
    int age;
    public void setPlayerFromInput(Player p){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Players age: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Player contactNo: ");
        String contact=sc.next();
        System.out.print("Enter Players emailId: ");
        String emailid=sc.next();
        System.out.print("Enter Players address: ");
        String address=sc.next();
        p.setPlayerDetails(name, address, contact, emailid, age);
        // sc.close();
       
    }
    public void setPlayerDetails(String name,String address,String contactNo,String emailId,int age){
        this.name=name;
        this.address=address;
        this.contactNo=contactNo;
        this.emailID=emailId;
        this.age=age;
    }
    public void setPlayer(String name)
    {
        this.name=name;
    }
    public void getPlayerDetails(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Age: "+this.age);
        System.out.println("Player ContactNo: "+this.contactNo);
        System.out.println("Player EmailId: "+this.emailID);
        System.out.println("Player Address: "+this.address);
    }
    public String getPlayerName(){
        return this.name;
    }
}
