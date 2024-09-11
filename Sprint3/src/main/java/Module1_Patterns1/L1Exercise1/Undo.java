package Module1_Patterns1.L1Exercise1;

import java.util.*;

public class Undo {
    private static Undo instance = null;
    public List<String> commandsList;
    Scanner entry = new Scanner(System.in);

    private Undo(){
        commandsList = new ArrayList<>();
    }
    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand (String command){
        commandsList.add(command);
    }

    public void showList() {
        System.out.println("List of commands.");
        for (int i = 0; i < commandsList.size(); i++){
            System.out.println(i + ". " + commandsList.get(i));
        }
    }

    public void deleteCommand(int cmndNumber){
        if (commandsList.isEmpty()){
            System.out.println("Command List Empty. Please introduce a command.\n");
        } else {
            commandsList.remove(cmndNumber);
            System.out.println("The command was eliminated.\n");
        }
    }
}
