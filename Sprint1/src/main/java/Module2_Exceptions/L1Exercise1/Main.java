package Module2_Exceptions.L1Exercise1;

public class Main {
    public static void main(String[] args) {

        Sale sale1 = new Sale();

        try{
            sale1.calculateTotal();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        Product product1 = new Product("Banana", 4.50);
        sale1.addProduct(product1);
        Product product2 = new Product("Fish", 10.50);
        sale1.addProduct(product2);

        try {
            sale1.causeIndexError();
        } catch (IndexOutOfBoundsException err){
            System.out.println(err.getMessage());
        }
    }
}
