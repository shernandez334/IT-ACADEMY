package Module4.L1exercise3;
import Module4_Testing.L1exercise3.ArrayListExceptions;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestArrayList {
    @Test
    public void TestArrayListOutOfBounds(){
        ArrayList<String> ArrayListOutOfBounds = new ArrayList<>();
        ArrayListExceptions array1 = new ArrayListExceptions();
        String strOutOfBounds;
        try {
            strOutOfBounds = ArrayListOutOfBounds.get(0);
        } catch (IndexOutOfBoundsException err){
            strOutOfBounds = err.getMessage();
        }
        assertEquals(strOutOfBounds, array1.listOutOfBounds());
    }
}
