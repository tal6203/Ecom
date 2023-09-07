package com.creatures;

public class Monkey extends Animal{
    protected String climb_on_tree;

    public Monkey(String name, String climb_on_tree) {
        super(name);
        this.climb_on_tree = climb_on_tree;
    }
}
