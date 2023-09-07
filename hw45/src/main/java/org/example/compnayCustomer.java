package org.example;

public class compnayCustomer extends Customer{
    protected int id;
    protected String companyName;
    protected String bankName;
    protected Float amountOfMoney;

    public compnayCustomer(int id, String companyName, String bankName, Float amountOfMoney) {
        if (bankName.equals("Bank Discount")) {
            this.id = id;
            this.companyName = companyName;
            this.bankName = bankName;
            this.amountOfMoney = amountOfMoney;
        }
        else {
            throw new  IllegalArgumentException("Must only Bank Discount");
        }
    }
}
