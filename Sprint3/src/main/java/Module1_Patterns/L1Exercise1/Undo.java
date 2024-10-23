package Module1_Patterns.L1Exercise1;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Undo {
    private static Undo instance = null;
    private List<String> commandsList;
    private static final Logger log = LoggerFactory.getLogger(Undo.class);
    private static final Scanner sc = new Scanner(System.in);
    private static final String MENU_OPTIONS = "Choose an option.\n" +
            "1. Add a command to the list.\n" +
            "2. Remove a command from the list.\n" +
            "3. Show list of commands.\n" +
            "4. End process.";


    private Undo(){
        commandsList = new ArrayList<>();
    }

    public List<String> getCommandsList(){
        return commandsList;
    }

    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void run(){
        commandMenuOptions();
    }

    public void commandMenuOptions(){
        int op = 0;
        while (op != 4) {
            System.out.println(MENU_OPTIONS);
            op = sc.nextInt();

            switch (op){
                case 1 -> addCommandToTheList();
                case 2 -> initiateRemoveCommand();
                case 3 -> showList();
                case 4 -> System.out.println("Process ended.");
                default -> System.out.println("Invalid option.");
            }
        }
    }

    public void addCommandToTheList(){
        System.out.println("Introduce the command you want to add from the list.");
        String cmnd = sc.next();
        addCommand(cmnd);
    }

    public void addCommand (String command){
        commandsList.add(command);
    }

    public void initiateRemoveCommand(){
        showList();
        System.out.println("Introduce the number of the command you want to remove to the list.");
        int cmndIndex = sc.nextInt();
        handleCommandRemoval(cmndIndex);
    }

    public void showList() {
        System.out.println("List of commands.");
        for (int i = 0; i < commandsList.size(); i++){
            System.out.println(i + ". " + commandsList.get(i));
        }
    }

    public void handleCommandRemoval(int cmndIndex){
        try{
            removeCommandByIndex(cmndIndex);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Input out of bounds");
            log.error("Input out of bounds");
        }
    }

    public void removeCommandByIndex(int cmndIndex){
        if (commandsList.isEmpty() || cmndIndex >= commandsList.size()){
            throw new IndexOutOfBoundsException("Wrong command input.");
        }
        commandsList.remove(cmndIndex);
        System.out.println("The command was eliminated.\n");
    }
}
