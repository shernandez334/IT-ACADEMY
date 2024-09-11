package Module1_Patterns1.L1Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        int op = 0;
        String cmnd;
        int cmndNumber;
        Scanner entry = new Scanner(System.in);
        while (op != 4) {
            System.out.println("Choose an option.\n"
                    + "1. Add a command to the list.\n"
                    + "2. Remove a command from the list.\n"
                    + "3. Show list of commands.\n"
                    + "4. End process.\n");
            op = entry.nextInt();
            entry.nextLine();

            switch (op){
                case 1:
                    System.out.println("Introduce the command you want to add to the list.");
                    cmnd = entry.nextLine();
                    undo.addCommand(cmnd);
                    break;
                case 2:
                    undo.showList();
                    System.out.println("Introduce the number of the command you want to remove to the list.");
                    cmndNumber = entry.nextInt();
                    undo.deleteCommand(cmndNumber);
                    break;
                case 3:
                    undo.showList();
                    break;
                case 4:
                    System.out.println("Process ended.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}