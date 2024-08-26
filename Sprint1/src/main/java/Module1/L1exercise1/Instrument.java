package Module1.L1exercise1;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public abstract String tocar();
}
