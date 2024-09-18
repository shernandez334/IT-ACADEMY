package Main;

public class Clues {
    private int id = 0;
    private int idCounter = id++;
    private String name;
    private double estTime;
    private double price;
    private String theme;

    public Clues(String name, double estTime, double price, String theme){
        this.name = name;
        this.estTime = estTime;
        this.price = price + (price * 0.10);
        this.theme = theme;
    }
}
