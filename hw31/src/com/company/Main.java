package com.company;

public class Main {
    public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.radius = 5.4;
    Circle c2 = new Circle();
    c2.radius = 8.7;
    c1.printSize();
        System.out.println("");
    c2.printSize();

        System.out.println("");

    Person tal = new Person();
    tal.id = "31844444";
    tal.yearOfBirth = 1997;
    tal.address = "Holon";
    tal.sayHello();
    tal.printHowOldAmI();
    System.out.println("");
    tal.printAddress();
    System.out.println("");
    tal.allDetails();

    }
}