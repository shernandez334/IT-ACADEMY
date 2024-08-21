package Module6_GenericMethods.L3exercise1;

public class Smartphone implements Telephone{
    public void call(int number){
        System.out.println("The number "  + number + " is calling.");
    }
    public void takingPictures(){
        System.out.println("It is taking pictures");
    }
}
