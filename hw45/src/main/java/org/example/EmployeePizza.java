package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class EmployeePizza {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String adress;
    protected Float salary;
    protected LocalDate startDate;

    @Getter
    private int pizzaRank;
    protected LocalDate pizzaRankDate;
    protected String pizzaSurprise;


    public EmployeePizza(int id, String firstName, String lastName, String adress, Float salary,String pizzaSurprise) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.salary = salary;
        this.startDate = LocalDate.now();
        this.pizzaRank = getPizzaRank();
        this.pizzaRankDate = LocalDate.now();
        this.pizzaSurprise = pizzaSurprise;
    }
public void setPizzaRank(){
    Random random = new Random();
    this.pizzaRank = random.nextInt(100)+1;
    this.pizzaRankDate = LocalDate.now();
}
    public void activateSurprise(){
        System.out.println("You got a surprise! Congratulations!");

    }
}
