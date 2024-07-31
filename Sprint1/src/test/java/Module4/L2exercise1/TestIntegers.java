package Module4.L2exercise1;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class TestIntegers {
    @Test
    public void testEqualIntegers(){
        Assertions.assertThat(1).isEqualTo(1);
    }

    @Test
    public void testNotEqualIntegers(){
        Assertions.assertThat(1).isNotEqualTo(2);
    }
}
