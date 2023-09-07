package org.example;

public abstract class ElectricDevice {
    protected Float voltage;
    protected boolean worksOnBatteries;
    protected boolean isFaulty;

    public ElectricDevice(boolean worksOnBatteries) {
        this.worksOnBatteries = worksOnBatteries;
        this.isFaulty = false;
    }

    public void turnOn(){
        System.out.println("Turning device on...");
    }
    public final void insertNewBatteries(){
        if (this.worksOnBatteries){
            System.out.println("Inserting new batteries to the device");
        }
        else {
            System.out.println("This device doesn’t use batteries!");
        }
        }
        public abstract void useDevice();
        public abstract void fixDevice();
    }

