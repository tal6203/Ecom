package org.example;

import java.util.Comparator;

public class CarSortByBrandCreation implements Comparator<Car> {


    @Override
    public int compare(Car car1,Car car2) {
        return car1.getCreation().compareTo(car2.getCreation());

    }
}
