package com.forest;

public class Apartment {
    protected String adress;
    protected Float size;

    public Apartment(String adress, Float size) {
        this.adress = adress;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "adress='" + adress + '\'' +
                ", size=" + size +
                '}';
    }
}
