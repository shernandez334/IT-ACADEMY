package Module6_GenericMethods.L3exercise1;

public class Generic{
    public static <T extends Telephone> void call(T telephone){
        telephone.call(123456789);
    }
    public static <T extends Smartphone> void takingPictures(T smartphone){
        smartphone.takingPictures();
    }
}
