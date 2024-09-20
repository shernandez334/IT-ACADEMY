package Module4.L1exercise3;

import Module4_Testing.L1exercise3.ArrayListExceptions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    @Test
    public void TestArrayListOutOfBounds(){
        List<String> outOfBoundsList = new ArrayList<>();
        outOfBoundsList.add("element");
       assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
           ArrayListExceptions.listOutOfBounds(outOfBoundsList, 1);
       });
    }
}
