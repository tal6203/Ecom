package org.example;

public interface Imethod {
    void takePayment(Customer customer,int payment);
    void increaseRevenue(int reveneueToAdd);
    void  increaseExpenses(int expensesToIncrease);
    Float calculateCustomerMoney();
}
