package org.example;

public abstract class Mechanic {
    protected String name;
    protected int experience_of_years;


    public abstract void repair();

    public void useScrewdriver(){
        System.out.println("Using screwdriver to open this screw...");
    }

}
