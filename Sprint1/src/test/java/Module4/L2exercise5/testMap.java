package Module4.L2exercise5;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class testMap {
    @Test
    public void testAddingKeyToMap(){
        boolean keyExist;
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("One", 1);
        keyExist = testMap.containsKey("One");
        Assertions.assertThat(keyExist).isTrue();
    }
}
