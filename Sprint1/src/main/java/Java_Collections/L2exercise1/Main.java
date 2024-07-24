package Java_Collections.L2exercise1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantSet = new HashSet<Restaurant>();

        restaurantSet.add(new Restaurant("Wendy's", 88));
        restaurantSet.add(new Restaurant("Wendy's", 88));
        restaurantSet.add(new Restaurant("Burger King", 70));
        restaurantSet.add(new Restaurant("Burger King", 71));
        for(Restaurant restaurant: restaurantSet){
            System.out.println(restaurant.getName());
            System.out.println(restaurant.getScore());
        }
    }
}
