package org.example;

public class Cellphone extends ElectricDevice{
    protected String brand;

    public Cellphone(String brand) {
        super(true);
        this.brand = brand;
    }


    @Override
    public void useDevice() {
        System.out.println("taking on the phone");
    }

    @Override
    public void fixDevice() {
        if (this.isFaulty){
            System.out.println("fixing cellphone");
            this.isFaulty = false;
        }
        else {
            System.out.println("this cellphone is working properly");
        }
    }
}
