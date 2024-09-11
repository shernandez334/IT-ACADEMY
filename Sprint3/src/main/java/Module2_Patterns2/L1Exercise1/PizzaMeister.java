package Module2_Patterns2.L1Exercise1;


public class PizzaMeister {

    public static Pizza hawaiian(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.cook();
    }

    public static Pizza vegetarian(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.cook();
    }
}
