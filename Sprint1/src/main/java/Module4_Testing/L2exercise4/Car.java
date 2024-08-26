package Module4_Testing.L2exercise4;

public class Car {
    private String brand;
    private int price;

    public Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }

    public Integer getPrice(){
        return this.price;
    }
}
