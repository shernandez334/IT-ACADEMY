package Module1.L1exercise1;

public class Main {
    public static void main(String[] args) {

        WindInstrument instrument1 = new WindInstrument("Flute", 150);
        System.out.println(instrument1.tocar());

        PercussionInstrument instrument2 = new PercussionInstrument("Drums", 300);
        System.out.println(instrument2.tocar());

        StringInstrument instrument3 = new StringInstrument("Guitar", 500);
        System.out.println(instrument3.tocar());
    }
}