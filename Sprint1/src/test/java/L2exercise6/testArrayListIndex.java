package L2exercise6;

import Module4_Testing.L2exercise6.Product;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testArrayListIndex {
    @Test
    public void testArrayIndexOutOfBounds(){
        String ArrayListIndex;
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coca Cola"));
        try {
            ArrayListIndex = products.get(1).getName();
        } catch (IndexOutOfBoundsException err){
            ArrayListIndex = err.getMessage();
        }
        Assertions.assertThat(products.get(0).ArrayIndexOutOfBounds()).isEqualTo(ArrayListIndex);
    }
}
