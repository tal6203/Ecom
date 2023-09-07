package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chair {
    private String model;
    private int numberOfLegs;
    private Float price;

    public Chair(String model, int numberOfLegs, Float price) {
        this.model = model;
        this.numberOfLegs = numberOfLegs;
        this.price = price;
    }
    public String printChair(){
    String format = String.format("The model is: %s,The number of legs is: %d,The price is: %f",getModel(),getNumberOfLegs(),getPrice());
        return format;
    }
    public Float calculatePrice(int numberOfChairs){
        return numberOfChairs * getPrice();
    }

}
