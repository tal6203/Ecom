package org.example;

public class Circle extends GeometricObject{
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return (Math.PI * this.radius)*2;
    }
    public double getArea(){
        return (this.radius * this.radius)* Math.PI;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
