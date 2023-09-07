package org.example;

public class BankLeomi extends Bank{
    public BankLeomi(int id, String bankName, int numberOfEmployees, Float amountOfRevenue, Float amountOfExpenses, Customer[] arrCustomer) {
        super(id, bankName, numberOfEmployees, amountOfRevenue, amountOfExpenses, arrCustomer);
    }

    @Override
    public void takePayment(Customer customer, int payment) {
        if (customer.bankName.equals("Bank Leomi")){
            customer.amountOfMoney =- payment;
        }
    }

    @Override
    public Float calculateCustomerMoney() {
        Float sum = 0f;
        for (int i = 0; i < arrCustomer.length; i++){
            sum+=arrCustomer[i].amountOfMoney;
        }
        return amountOfRevenue - sum;
    }
}
