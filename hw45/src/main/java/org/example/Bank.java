package org.example;

import java.security.KeyRep;

public abstract class Bank implements Imethod{
    protected int id;
    protected String bankName;
    protected int numberOfEmployees;
    protected Float amountOfRevenue;
    protected Float amountOfExpenses;
    protected Customer [] arrCustomer;

    public Bank(int id, String bankName, int numberOfEmployees, Float amountOfRevenue, Float amountOfExpenses, Customer[] arrCustomer) {
        this.id = id;
        this.bankName = bankName;
        this.numberOfEmployees = numberOfEmployees;
        this.amountOfRevenue = amountOfRevenue;
        this.amountOfExpenses = amountOfExpenses;
        this.arrCustomer = arrCustomer;
    }

    @Override
    public void increaseRevenue(int reveneueToAdd) {
        amountOfRevenue = (float) + reveneueToAdd;
    }

    @Override
    public void increaseExpenses(int expensesToIncrease) {
        amountOfExpenses = (float) + expensesToIncrease;
    }
}
