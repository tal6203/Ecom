package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car implements Comparable <Car> {
    protected String id;
    protected String brand;
    protected String model;
    protected LocalDateTime creation;
    protected String color;
    protected int seats;
   public static CarSortByBrandAndModel CarSortByBrandAndModel = new CarSortByBrandAndModel();
   public static CarSortByBrandCreation CarSortByBrandCreation= new CarSortByBrandCreation();
   public static CarSortByColor CarSortByColor = new CarSortByColor();
   public static CarSortBySeats CarSortBySeats = new CarSortBySeats();

    public int compareTo(Car car) {
        return this.id.compareTo(car.getId());
    }

}
