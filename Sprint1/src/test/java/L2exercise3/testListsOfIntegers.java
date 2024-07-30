package L2exercise3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testListsOfIntegers {
    @Test
    public void testEqualListsOfIntegers(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        Assertions.assertThat(list1).isEqualTo(list2);
    }

    @Test
    public void testNotEqualListsOfIntegers(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 4);
        Assertions.assertThat(list1).isNotEqualTo(list2);
    }
}
