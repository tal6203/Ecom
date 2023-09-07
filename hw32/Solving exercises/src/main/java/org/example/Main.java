package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //.19
    public static String magicWord = "tal";
    //.20
    public static int [] arr = {2 ,6 ,7 ,8 ,34 ,16};
    public static void greet(){
        System.out.println("Good morning!");
    }
    public static void printNum(int num){
        System.out.println(num);
    }
    public static int changeNumber(int num){
        num += 1;
        return num;
    }
    public static void multiply(int num1,int num2){
        System.out.format("%d * %d = %d",num1,num2,num1*num2);
    }
    public static void calc(int num1,int num2,String operation){
        switch (operation){
            case "+":
                System.out.format("%d + %d = %d",num1,num2,num1+num2);
                break;
            case "-":
                System.out.format("%d - %d = %d",num1,num2,num1-num2);
                break;
            case "*":
                System.out.format("%d * %d = %d",num1,num2,num1*num2);
                break;
            case "/":
                System.out.format("%d / %d = %d",num1,num2,num1/num2);
                break;
            default:
                System.out.println("Invoice operation is not valid");
        }
    }
    public static float avg(int num1,int num2,int num3){
        return (num1 + num2 + num3)/3;
    }

    public static boolean checkNumInArr(int [] arr,int num){
        return Arrays.stream(arr).anyMatch(x -> x == num);
    }

    public static void printDivision(int num){
        for (int i = 1; i < num; i++){
            if (num % i == 0 ){
                System.out.println(i);
            }
        }
    }

    public static void hello(){
        System.out.println("Hello");
        world();
    }
    public static void world(){
        System.out.println("World");
    }
    public static void numberType(int num){
        System.out.println("int");
    }
    public static void numberType(double num){
        System.out.println("double");
    }
    public static void numberType(float num){
        System.out.println("float");
    }

    public static Scanner getScanner(){
        Scanner s = new Scanner(System.in);
        return s;
    }

    public static int randomize(int [] arr){
    Random rand = new Random();
    return arr[rand.nextInt(arr.length)];

    }

    public static String printer(String str){
        String newStr = str + "@@@";
        return addStar(newStr);
    }
    public static String addStar(String str){
        String newStr = str + "**";
        return addLadder(newStr);
    }
    public static String addLadder(String str){
        String newStr = str + "#";
        return newStr;
    }

    public static void printWord(){
        System.out.println(magicWord);
    }
    public static void changeWord(){
       magicWord = magicWord.toUpperCase();
    }
    public static void multiplyZugi(){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arr[i] = arr[i] * 2;
            }
        }
    }
    public static void addOne(){
        arr[arr.length -1] = arr[arr.length -1] + 1;
    }
    public static void setZero(){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] = 0;
            }
        }
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static boolean checkPass(String [] pass){
        boolean flag = false;
        if (pass.length >= 8){
            if (Arrays.stream(pass).anyMatch(x -> x.matches("[a-zA-Z]+"))){
                if (Arrays.stream(pass).anyMatch(x -> x.matches("[0-9]"))){
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static int sumOfMatrix(int [][] matrix){
        int sum = 0;
        for (int[] ints : matrix) {
            sum += Arrays.stream(ints).sum();
        }
        return sum;
    }

    public  static int factorialRecurs(int num) {
        if (num == 0) {
            return 1;
        } else {
            return factorialRecurs(num - 1) * num;
        }
    }
    public static void main(String[] args) {
        //.3
          greet();
        //.4
        printNum(7);
        //.5
        for (int i = 1; i < 11; i++){
            printNum(i);
        }
        //.6
        int k = 5;
        System.out.println(changeNumber(k));
        //.7
        multiply(7,5);
        System.out.println("");
        multiply(3,6);
        System.out.println("");
        multiply(5,4);
        //.8
        calc(7,3,"+");
        System.out.println("");
        calc(6,4,"-");
        System.out.println("");
        calc(2,2,"*");
        System.out.println("");
        calc(9,3,"/");
        //.9
        System.out.println(avg(10,20,30));
        //.10
        int [] arr =  {4,2,9,7};
        System.out.println(checkNumInArr(arr,9));
        //.11
        printDivision(10);
        //.12
        hello();
        //.14
        int num1 = 7;
        double num2 = 7.42;
        float num3 = 5.3F;

        numberType(num1);
        numberType(num2);
        numberType(num3);
        //.15
      Scanner s = getScanner();
        //.16
        int [] arr1 = {1,2,3,4,5};
        System.out.println(randomize(arr1));
        //.17
        System.out.println(printer("David"));
        //.19
        changeWord();
        printWord();
        //.20
        multiplyZugi();
        addOne();
        setZero();
        System.out.println(Arrays.toString(arr));
        // YES
        //.21
        System.out.println(sumOfDigit(524));
        //.22
        String [] pass = {"p","a","s","s","1","2","3","4","5"};
        System.out.println(checkPass(pass));;
        // .23
        int [][] matrix = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = rand.nextInt(100)+1;
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }
        System.out.format("The sum of the matrix is: %d",sumOfMatrix(matrix));
        //.25
        System.out.println(factorialRecurs(5));









    }
}