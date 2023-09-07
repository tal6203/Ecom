package org.example;

public class Rectangle extends GeometricObject{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
