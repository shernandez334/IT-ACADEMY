package Main;

import java.util.Scanner;

public class BuildEscapeRoom {
    static Scanner sc = new Scanner(System.in);

    public static void createEscapeRoom(){
        int op = 0;
        String nameRoom;
        String roomDiff;
        String nameClues;
        double estTime;
        double priceClues;

        EscapeRoom escapeRoom = new EscapeRoom();
        addDecorations(escapeRoom);
        addClues(escapeRoom);
        while (op != 4){
            System.out.print("Welcome to the Escape Room\n" +
                    "1. Create a room.\n" +
                    "2. Introduce Clues to an specific room.\n" +
                    "3. Show inventory." +
                    "4. Exit.");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("What is the name of the room.");
                    nameRoom = sc.next();
                    System.out.println("Room Difficulty?");
                    roomDiff = sc.next();
                    buildThemeRooms(escapeRoom, nameRoom, roomDiff);
                    break;
                case 2:
                    
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong Option.");
                    break;

            }
        }
    }

    public static void addDecorations(EscapeRoom escapeRoom){
        escapeRoom.addDecorations(new DecObjects("Machete", 5, "Rubber"));
        escapeRoom.addDecorations(new DecObjects("Mouse Trap", 15, "Metal"));
        escapeRoom.addDecorations(new DecObjects("Key", 10, "Brass"));
    }

    public static void addClues(EscapeRoom escapeRoom){
        escapeRoom.addClues(new Clues("clue1", 5, 5, "I’m tall when I’m young, and I’m short when I’m old. What am I?"));
        escapeRoom.addClues(new Clues("clue2", 10, 10, " I have branches, but no fruit, trunk or leaves. What am I?"));
        escapeRoom.addClues(new Clues("clue3", 2, 2, ": I shave every day, but my beard stays the same. What am I?"));
    }

    public static void buildThemeRooms(EscapeRoom escapeRoom, String nameRoom, String nameDiff){
        escapeRoom.addThemeRoom(new ThemeRoom(nameRoom, nameDiff));
    }
}
