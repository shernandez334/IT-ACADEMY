package Java_Collections.L1exercise1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Month month){
            if (this.name.equals(month.name)){
                return true;
            } else {
               return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
