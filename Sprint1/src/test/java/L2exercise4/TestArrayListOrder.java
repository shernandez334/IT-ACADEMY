package L2exercise4;

import Module4_Testing.L2exercise4.Car;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void testArrayListInAnyOrder(){
        ArrayList<Car> Dealership = new ArrayList<Car>();
        Dealership.add(new Car("Ferrari", 300000));
        Dealership.add(new Car("Mercedes", 300000));
        Dealership.add(new Car("Mercedes", 250000));
        Assertions.assertThat()
    }
}
