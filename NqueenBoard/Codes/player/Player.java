package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactNo;
    String address;
    String emailID;
    int age;
    public void setPlayerDetails(String name,String contactNo,String address,String emailID,int age){
        this.name=name;
        this.contactNo=contactNo;
        this.address=address;
        this.age=age;
    }
    public void setPlayerFromInput(Player p){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Player Age: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Player contactNo: ");
        String contactNo=sc.nextLine();
        System.out.print("Enter Player EmailID: ");
        String emailID=sc.nextLine();
        System.out.print("Enter Player Address: ");
        String address=sc.nextLine();
        p.setPlayerDetails(name, contactNo, address, emailID, age);
    }
    public void getPlayerDetails(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Age: "+this.age);
        System.out.println("Player ContactNo: "+this.contactNo);
        System.out.println("Player EmailId: "+this.emailID);
        System.out.println("Player Address: "+this.address);
    }
}
