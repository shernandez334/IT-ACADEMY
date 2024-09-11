package Module2_Patterns2.L1Exercise1;

import java.util.Scanner;
import static Module2_Patterns2.L1Exercise1.PizzaMeister.hawaiian;
import static Module2_Patterns2.L1Exercise1.PizzaMeister.vegetarian;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        String size = "";
        String dough = "";
        String toppings = "";
        Scanner entry = new Scanner(System.in);
        System.out.println("What kind of pizza would you like?\n" +
                "1. Hawaiian.\n" +
                "2. Vegetarian.");
        op = entry.nextInt();
        System.out.println("What size?");
        size = entry.next();
        System.out.println("Type of dough?");
        dough = entry.next();
        System.out.println("Toppings?");
        toppings = entry.next();
        switch(op){
            case 1:
                Pizza pizza1 = hawaiian(new PizzaBuilder()
                        .setSize(size).setDough(dough).setToppings(toppings));
                break;
            case 2:
                Pizza pizza2 = vegetarian(new PizzaBuilder()
                        .setSize(size).setDough(dough).setToppings(toppings));
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
    }

}
