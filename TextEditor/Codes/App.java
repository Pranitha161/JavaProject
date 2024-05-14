import java.util.Scanner;

import notepad.Notepad;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Notepad notepad=new Notepad(100);
        int choice;
        do{
            System.out.println("Choose your option\n1. Display the text.\n2. Dispaly the text from given lines.\n3.Insert the text.\n4.Delete the text.\n5. Delete from given lines.\n6.Copy the text.\n7. Paste the text.\n8. Undo your action.\n9. Redo your action.\n10. Exit");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();
            int line,start,end;
            switch (choice) {
                case 1:
                    notepad.display();
                    break;
                case 2:
                    System.out.println("Enter the starting and ending line value:");
                    start=sc.nextInt();
                    end=sc.nextInt();
                    notepad.display(start, end);
                    break;
                case 3:
                    System.out.println("Enter the text");
                    String txt=sc.next();
                    System.out.println("Enter the line Number:");
                    line=sc.nextInt();
                    notepad.insertLine(line, txt);
                    break;
                case 4:
                    System.out.println("Enter the line number:");
                    line=sc.nextInt();
                    notepad.delete(line);
                    break;
                case 5:
                    System.out.println("Enter starting and ending line value");
                    start=sc.nextInt();
                    end=sc.nextInt();
                    notepad.delete(start, end);
                    break;
                case 6:
                    System.out.println("Enter starting and endling line value");
                    start=sc.nextInt();
                    end=sc.nextInt();
                    notepad.copy(start, end);
                    break;
                case 7:
                    System.out.println("Enter the line number");
                    line=sc.nextInt();
                    notepad.paste(line);
                    break;
                case 8:
                    notepad.undo();
                    break;
                case 9:
                    notepad.redo();
                    break;
                case 10:
                    System.exit(0);
                default:
                    break;
            }
            
        }
        while(true);

    }
}
