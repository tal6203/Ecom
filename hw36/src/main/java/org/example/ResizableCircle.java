package org.example;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
       this.radius = ((percent / 100) * this.radius) + this.radius;
    }
}
