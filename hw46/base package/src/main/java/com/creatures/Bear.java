package com.creatures;

public class Bear extends Animal{
    protected String eatFish;

    public Bear(String name, String eatFish) {
        super(name);
        this.eatFish = eatFish;
    }

}
