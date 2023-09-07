package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void identifyTeacher(Teacher teacher){
        if (teacher instanceof MathTeacher){
            System.out.println(((MathTeacher) teacher).math_skills);
        }
        else System.out.println(((HistoryTeacher) teacher).field_of_profession);
    }

        public static void main(String[] args) {
            ArrayList<Car> carArrayList = new ArrayList<Car>();
            carArrayList.add(
                    new Car("50-567-56",
                            "Mitsubishi",
                            "outlander",
                            LocalDateTime.of(2020, 5, 13,6,30),
                            "blue",
                            2017));
            carArrayList.add(new Car("60-666-48",
                    "Mazda",
                    "2",
                    LocalDateTime.of(2019, 6, 20,16,50),
                    "red",
                    2019));
            carArrayList.add(new Car("70-578-46",
                    "Subaru",
                    "b4",
                    LocalDateTime.of(2001, 4, 5,18,22),
                    "black",
                    2020));
            carArrayList.add(new Car("50-567-56",
                    "Toyota",
                    "corolla",
                    LocalDateTime.of(2018, 11, 7,15,22),
                    "green",
                    2015));
            System.out.println("before sort");
            System.out.println(carArrayList.toString());
            System.out.println("after sort");
            Collections.sort(carArrayList);
            Collections.sort(carArrayList,Car.CarSortByColor);
            Collections.sort(carArrayList,Car.CarSortByBrandCreation);
            Collections.sort(carArrayList,Car.CarSortByBrandAndModel);
            Collections.sort(carArrayList,Car.CarSortBySeats);
            System.out.println(carArrayList.toString());

           // Sorting using anonymous functions

            Collections.sort(carArrayList,(car1,car2) -> car1.getId().compareTo(car2.getId()));
            Collections.sort(carArrayList,(car1,car2) -> car1.getColor().compareTo(car2.getColor()));
            Collections.sort(carArrayList,(car1,car2) -> car1.getCreation().compareTo(car2.getCreation()));
            Collections.sort(carArrayList,(car1,car2) -> car1.getSeats() - car2.getSeats());
            Collections.sort(carArrayList,(car1,car2) -> {
                int result = car1.getBrand().compareTo(car1.getBrand());
                if (result == 0){
                    return car1.getModel().compareTo(car1.getModel());
                }
                else return result;});
            
            System.out.println(carArrayList.toString());



            Teacher math = new MathTeacher("Tal","203456789",95);
            Teacher history = new HistoryTeacher("Gal","316452398","World War II");

    }
}