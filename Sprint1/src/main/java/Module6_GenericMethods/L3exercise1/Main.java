package Module6_GenericMethods.L3exercise1;

public class Main {
    public static void main(String[] args) {
        Generic generic = new Generic();
        Smartphone phone1 = new Smartphone();
        Generic.call(phone1);
        Generic.takingPictures(phone1);
    }
}