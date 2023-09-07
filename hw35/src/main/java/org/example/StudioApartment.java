package org.example;

public class StudioApartment extends Apartment{
    protected int number_of_rooms;

    public StudioApartment(String address, Float size, int number_of_rooms) {
        super(address, size);
        this.number_of_rooms = number_of_rooms;
    }

    @Override
    public String toString() {
        return "StudioApartment{" +
                "number_of_rooms=" + number_of_rooms +
                super.toString();
    }
}
