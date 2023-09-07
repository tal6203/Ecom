package org.example;

public class Rectangle {
    protected float height;
    protected float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }
    public Float getArea(){
        return this.width * this.height;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

}
