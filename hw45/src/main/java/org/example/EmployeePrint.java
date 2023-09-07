package org.example;

public class EmployeePrint {
    protected String name;
    protected int yearOfJoin;
    protected  Float salary;
    protected String adress;

    public EmployeePrint(String name, int yearOfJoin, Float salary, String adress) {
        this.name = name;
        this.yearOfJoin = yearOfJoin;
        this.salary = salary;
        this.adress = adress;
    }

    public void printEmployee(){
        System.out.format(this.name+" "+ this.yearOfJoin+" "+ this.adress);
    }
}
