package Module1.L1exercise1;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, double price){
        super(name, price);
    }

    static {
        System.out.println("Static String class");
    }
    {
        System.out.println("Initialization of String class");
    }

    @Override
    public String tocar(){
        return "A string instrument is playing" + "\n";
    }
}
