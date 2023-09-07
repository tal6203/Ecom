package org.example;

public class TV extends ElectricDevice{
    protected Float size_screen;

    public TV(Float size_screen) {
        super(false);
        this.size_screen = size_screen;
    }

    @Override
    public void useDevice() {
        System.out.println("watching TV...");
    }

    @Override
    public void fixDevice() {
        if (this.isFaulty){
            System.out.println("fixing TV...");
            this.isFaulty = false;
        }
        else {
            System.out.println("this tv is working properly");
        }
    }
}
