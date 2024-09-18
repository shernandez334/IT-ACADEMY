package Main;

import java.util.ArrayList;
import java.util.List;

public class EscapeRoom {
    private List<ThemeRoom> rooms = new ArrayList<ThemeRoom>();
    private List<DecObjects> decorations = new ArrayList<DecObjects>();
    private List<Clues> clues = new ArrayList<Clues>();

    public void addThemeRoom(ThemeRoom room){
        rooms.add(room);
    }
    public void addDecorations(DecObjects decor){
        decorations.add(decor);
    }
    public void addClues(Clues clue){
        clues.add(clue);
    }

    public List<ThemeRoom> getThemeRoom(){
        return this.rooms;
    }
    public List<DecObjects> getDecObjects(){
        return this.decorations;
    }
    public List<Clues> getClues(){
        return this.clues;
    }



}
