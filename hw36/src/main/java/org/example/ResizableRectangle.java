package org.example;

public class ResizableRectangle extends Rectangle implements Resizable{
    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public void resize(int percent){
        this.length = ((percent / 100) * this.length) + this.length;
        this.width = ((percent / 100) * this.width) + this.width;
    }
}
