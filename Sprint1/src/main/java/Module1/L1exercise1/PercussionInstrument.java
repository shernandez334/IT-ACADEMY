package Module1.L1exercise1;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, double price){
        super(name, price);
    }

    static {
        System.out.println("Static Percussion class");
    }
    {
        System.out.println("Initialization of Percussion class");
    }

    @Override
    public String tocar(){
        return "A percussion instrument is playing" + "\n";
    }
}
