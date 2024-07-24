package Module3.L2exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurantList = new ArrayList<Restaurant>();

        restaurantList.add(new Restaurant("Wendy's", 88));
        restaurantList.add(new Restaurant("Wendy's", 87));
        restaurantList.add(new Restaurant("Burger King", 70));
        restaurantList.add(new Restaurant("Burger King", 71));

        Comparator<Restaurant> compareRestaurant = Comparator
                .comparing((Restaurant o) -> o.getName())
                .thenComparing((Restaurant o) -> o.getScore(), Comparator.reverseOrder());

        restaurantList.sort(compareRestaurant);
        restaurantList.forEach(r -> System.out.println(r.getName() + " " + r.getScore()));
    }
}