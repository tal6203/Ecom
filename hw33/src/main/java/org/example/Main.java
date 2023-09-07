package org.example;

public class Main {
    public static void main(String[] args) {
        Chair c1 = new Chair("212",4,400f);
        System.out.println(c1.calculatePrice(2));
        System.out.println(c1.printChair());
        System.out.println("");
        ComputerChair c2 = new ComputerChair("101",4,500f,true,true,50);
        System.out.println(c2.GetDiscount());
        System.out.println(c2.calculatePrice(3));
        System.out.println(c2.printChair());
        System.out.println("");
        KitchenChair c3 = new KitchenChair("256",4,600f,true,true,30);
        System.out.println(c3.GetDiscount());
        System.out.println(c3.calculatePrice(4));
        System.out.println(c3.printChair());
    }
}