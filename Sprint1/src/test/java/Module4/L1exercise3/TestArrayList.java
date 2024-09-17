package Module4.L1exercise3;
import Module4_Testing.L1exercise3.ArrayListExceptions;
import org.junit.Test;

import static Module4_Testing.L1exercise3.ArrayListExceptions.listOutOfBounds;
import static org.junit.Assert.*;
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
