package Module2_Patterns2.L1Exercise1;

public class PizzaBuilder {
    private String size;
    private String dough;
    private String toppings;

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setDough(String dough){
        this.dough = dough;
        return this;
    }
    public String getDough(){
        return this.dough;
    }

    public PizzaBuilder setToppings(String toppings){
        this.toppings = toppings;
        return this;
    }
    public String getToppings(){
        return this.toppings;
    }

    public Pizza cook(){
        return new Pizza(this.size, this.dough, this.toppings);
    }

}
