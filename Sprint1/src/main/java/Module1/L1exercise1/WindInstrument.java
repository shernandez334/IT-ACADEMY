package Module1.L1exercise1;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, double price){
        super(name, price);
    }

    static {
        System.out.println("Static Wind class");
    }
    {
        System.out.println("Initialization of Wind class");
    }

    @Override
    public String tocar(){
        return "A wind instrument is playing" + "\n";
    }
}
