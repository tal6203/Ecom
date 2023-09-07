package com.company;

public class Person {
    public String id ;
    public int yearOfBirth;
    public String address;

    public void sayHello(){
        System.out.println("Hello");
    }

    public void printHowOldAmI(){
        System.out.printf("Your year of birth is: %s",this.yearOfBirth);
    }

    public void printAddress(){
        System.out.format("Your address is: %s",this.address);
    }

    public void allDetails(){
        System.out.format("All your details: %s,%d,%s",this.id,this.yearOfBirth,this.address);
    }
}
