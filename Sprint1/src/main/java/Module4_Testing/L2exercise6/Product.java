package Module4_Testing.L2exercise6;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;


    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String ArrayIndexOutOfBounds(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coca Cola"));
        String strException = "";
        try{
            strException = products.get(1).getName();
        } catch (IndexOutOfBoundsException err){
            strException = err.getMessage();
        }
        return strException;
    }
}
