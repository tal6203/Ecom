package com.forest;

public class StudioApartment extends Apartment{
    protected int number_of_rooms;

    public StudioApartment(String adress, Float size, int number_of_rooms) {
        super(adress, size);
        this.number_of_rooms = number_of_rooms;
    }

    @Override
    public String toString() {
        return super.toString() +"StudioApartment{" +
                "number_of_rooms=" + number_of_rooms +
                ", adress='" + adress + '\'' +
                ", size=" + size +
                '}';
    }
}
