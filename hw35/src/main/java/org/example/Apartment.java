package org.example;

import lombok.ToString;

@ToString

public class Apartment {
    protected String address;
    protected Float size;

    public Apartment(String address, Float size) {
        this.address = address;
        this.size = size;
    }
}
