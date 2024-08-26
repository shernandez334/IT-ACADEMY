package Module4.L2exercise7;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Optional;

public class TestObject {

    @Test
    public void TestEmptyObject(){
        Optional<String> emptyObject = Optional.empty();
        Assertions.assertThat(emptyObject).isEmpty();
    }
}
