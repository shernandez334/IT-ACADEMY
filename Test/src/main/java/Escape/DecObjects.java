package Main;

public class DecObjects {
    private int idCounter;
    private final int id = idCounter++;
    private String name;
    private double price;
    private String typeMaterial;

    public DecObjects(String name, double price, String typeMaterial){
        this.name = name;
        this.price = price + (price * 0.21);
        this.typeMaterial = typeMaterial;
    }


}
