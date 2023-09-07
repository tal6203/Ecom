package org.example;

public class Student {
    protected String name;
    protected int roll_on;
    protected String phoneNumber;
    protected String adress;

    public Student(String name, int roll_on, String phoneNumber, String adress) {
        this.name = name;
        this.roll_on = roll_on;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_on=" + roll_on +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
