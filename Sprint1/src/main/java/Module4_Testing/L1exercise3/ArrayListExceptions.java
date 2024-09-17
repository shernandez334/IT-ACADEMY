package Module4_Testing.L1exercise3;

import java.util.List;

public class ArrayListExceptions {
    public static void listOutOfBounds(List<String> outOfBoundsList, int pos){
        if (pos >= outOfBoundsList.size() - 1) {
            throw new ArrayIndexOutOfBoundsException("Exception caught.");
        }
    }
}