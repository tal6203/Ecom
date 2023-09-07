package org.example;

import lombok.Getter;
import lombok.Setter;

abstract class  Animal  {
    @Getter
    @Setter
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}
