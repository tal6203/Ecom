package org.example;

import java.util.Comparator;

public class CarSortByBrandAndModel implements Comparator <Car> {
    @Override
    public int compare(Car car1, Car car2) {
        int result = car1.getBrand().compareTo(car1.getBrand());
        if (result == 0){
            return car1.getModel().compareTo(car1.getModel());
        }
        else return result;
    }
}
