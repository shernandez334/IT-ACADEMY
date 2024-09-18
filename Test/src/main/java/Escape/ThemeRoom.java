package Main;

import java.util.ArrayList;
import java.util.List;

public class ThemeRoom {
    private int idCounter;
    private final int id = idCounter++;
    private String name;
    private String level;
    private List<Clues> clues;
    private List<DecObjects> decorations;
    private int totalVal;

    public ThemeRoom(String name, String level){
        this.name = name;
        this.level = level;
        this.clues = new ArrayList<>();
        this.decorations = new ArrayList<>();
    }

    public void addDecorations(DecObjects decor){
        decorations.add(decor);
    }
    public void addClues(Clues clue){
        clues.add(clue);
    }
}
