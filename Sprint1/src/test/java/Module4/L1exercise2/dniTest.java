package Module4.L1exercise2;
import Module4_Testing.L1exercise2.CalculateDni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static Module4_Testing.L1exercise2.CalculateDni.calculateDniLetter;
import static org.junit.Assert.*;

public class dniTest {
    @ParameterizedTest
    @CsvSource(value = {
            "99999999: R",
            "99999998: T",
            "99999997: E",
            "99999996: K",
            "99999993: H",
            "99999991: Q",
            "99999990: S",
            "12345678: Z",
            "87654321: X",
            "13579246: T"}, delimiter = ':')
    public void testDniLetter(long number, char expectedLetter){
        assertEquals(expectedLetter, calculateDniLetter(number));
    }
}
