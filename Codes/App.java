import java.util.*;
import notepad.Notepad;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Notepad notepad= new Notepad(100);

        do{
            System.out.println("Choose your option");
            System.out.println("1. Display the text");
            System.out.println("2. Display the text from given lines");
            System.out.println("3. Insert the text");
            System.out.println("4. Delete the text");
            System.out.println("5. Delete from given lines");
            System.out.println("6. Copy the text");
            System.out.println("7. Paste the text");
            System.out.println("8. Undo your action");
            System.out.println("9. Redo your action");
            System.out.println("10. Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                     notepad.display();
                     break;
                case 2:
                    System.out.println("Enter the starting line and ending line value");
                    int startline = sc.nextInt();
                    int endline = sc.nextInt();
                    notepad.display(startline , endline);
                    break;
                case 3:
                    System.out.println("Enter the text: ");
                    String text = sc.next();
                    System.out.println("Enter the line number: ");
                    int line = sc.nextInt();
                    notepad.insertLine(line,text);
                    break;
                case 4:
                    System.out.println("Enter the line number");
                    line = sc.nextInt();
                    notepad.delete(line);
                    break;
                case 5:
                    System.out.println("Enter the starting line and ending line value: ");
                    startline = sc.nextInt();
                    endline = sc.nextInt();
                    notepad.delete(startline, endline);
                    break;
                case 6:
                    System.out.println("Enter the starting line and ending line value: ");
                    startline = sc.nextInt();
                    endline = sc.nextInt();
                    notepad.copy(startline, endline);
                    break;
                case 7:
                    System.out.println("Enter the line number: ");
                    line = sc.nextInt();
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
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}
