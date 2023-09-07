package com.company;

public class Circle {
    public double radius;
    private double pi = 3.14;
    public void printSize(){
        System.out.print((this.radius * this.radius) * pi);
    }
}
