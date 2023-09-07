package org.example;

import java.util.Comparator;

public class CarSortBySeats implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getSeats() - car2.getSeats();
    }
}
