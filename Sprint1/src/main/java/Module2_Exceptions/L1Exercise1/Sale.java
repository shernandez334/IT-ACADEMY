package Module2_Exceptions.L1Exercise1;

import java.util.ArrayList;

public class Sale {
    private double totalSale;
    private ArrayList<Product>products;

    public Sale(){
        this.products = new ArrayList<Product>();
    }

    public String addProduct(Product product1){
        this.products.add(product1);
        return "The product has been created.";
    }

    public void calculateTotal() throws EmptySaleException {
        if (this.products.isEmpty()){
            throw new EmptySaleException("To make a sale, first add a product.");
        }
        for (Product product1 : this.products){
            totalSale += product1.getPrice();
        }
    }

    public void causeIndexError() throws ArrayIndexOutOfBoundsException{
        int size = this.products.size();
        System.out.println(this.products.get(size));
    }
}
