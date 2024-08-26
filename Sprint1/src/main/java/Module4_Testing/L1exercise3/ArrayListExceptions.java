package Module4_Testing.L1exercise3;
import java.util.ArrayList;

public class ArrayListExceptions {
    private ArrayList<String> outOfBounds;

    public ArrayListExceptions(){
        this.outOfBounds = new ArrayList<>();
    }

    public String listOutOfBounds(){
        String str;
        try {
            str = this.outOfBounds.get(0);
        }
        catch (IndexOutOfBoundsException err){
            str = err.getMessage();
        }
        return str;
    }
}