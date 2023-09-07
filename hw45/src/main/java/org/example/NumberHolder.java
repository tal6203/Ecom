package org.example;

public class NumberHolder {
    public int intNumber;
    public float floatNumber;
    public NumberHolder(){}

    public NumberHolder(float floatNumber) {
        this.intNumber = 20;
        this.floatNumber = floatNumber;
    }
    public void printIntNumber(){
        System.out.println(this.intNumber);
    }
    public void printFloatNumber(){
        System.out.println(this.floatNumber);
    }

    @Override
    public String toString() {
        return "NumberHolder{" +
                "intNumber=" + intNumber +
                ", floatNumber=" + floatNumber +
                '}';
    }
}
