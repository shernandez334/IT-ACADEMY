package Module1.L2exercise1;

public class Smartphone extends Telephone implements Clock, Camera {

    public Smartphone(String brand, String model){
        super(brand, model);
    }

    @Override
    public String photograph(){
        return "A picture is being taken.";
    }
    @Override
    public String alarm(){
        return "The alarm is ringing.";
    }

}
