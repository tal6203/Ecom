package org.example;

import lombok.Getter;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog dog){
        System.out.println("Woooof");
    }
}
