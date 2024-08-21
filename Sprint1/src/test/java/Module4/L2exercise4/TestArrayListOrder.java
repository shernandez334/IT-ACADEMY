package Module4.L2exercise4;

import Module4_Testing.L2exercise4.Car;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayListOrder {

    @Test
    public void testArrayListIsInOrder(){
        ArrayList<Car> Dealership = new ArrayList<Car>();
        Dealership.add(new Car("Ferrari", 300000));
        Dealership.add(new Car("Mercedes", 250000));
        Dealership.add(new Car("Mercedes", 300000));
        Assertions.assertThat(Dealership).isSortedAccordingTo(
                Comparator.comparing(Car::getBrand)
                        .thenComparingInt(Car::getPrice));
    }

    @Test
    public void testArrayListInAnyOrder(){
        boolean areEqualLists;
        ArrayList<Car> dealerShipListOfCars = new ArrayList<>();
        dealerShipListOfCars.add(new Car("Ferrari", 300000));
        dealerShipListOfCars.add(new Car("Mercedes", 300000));
        dealerShipListOfCars.add(new Car("Mercedes", 250000));
        List<Car> dealerShipSortedListOfCars = dealerShipListOfCars.stream()
                .sorted(Comparator.comparing(Car::getBrand).thenComparingInt(Car::getPrice))
                .toList();
        areEqualLists = dealerShipListOfCars.equals(dealerShipSortedListOfCars);
        Assertions.assertThat(areEqualLists).isFalse();
    }
}
