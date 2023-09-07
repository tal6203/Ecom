package org.example;

public class Average {
    protected int num1;
    protected int num2;
    protected int num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void getAvg(){
        System.out.println((this.num1 + this.num2 + this.num3) / 3);
    }

}
