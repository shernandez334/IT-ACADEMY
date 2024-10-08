package Module4.L2exercise6;

import Module4_Testing.L2exercise6.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class testArrayListIndex {
    @Test
    public void testArrayIndexOutOfBounds(){
        String ArrayListIndex;
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coca Cola"));
        Assertions.assertThat(products.get(0).ArrayIndexOutOfBounds()).isEqualTo("Index 1 out of bounds for length 1");
    }
}
