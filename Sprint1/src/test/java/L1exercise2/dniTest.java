package L1exercise2;
import Module4_Testing.L1exercise2.CalculateDni;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dniTest {
    @Test
    public void testDniLetter(){
        String letter = "TRWAGMYFPDXBNJZSQVHLCKE";
        char dniLetter;
        CalculateDni dni1 = new CalculateDni(2222222222L);
        assertEquals(dni1.calculateDniLetter(), 'B');
    }
}
