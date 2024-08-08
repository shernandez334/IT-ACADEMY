package Module3_Java_Collections.L2exercise2;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof  Restaurant restaurant){
            if (this.name.equals(restaurant.name) && this.score == restaurant.score){
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