package targilim;

import java.util.Arrays;

import java.util.Scanner;
public class Main {
    static String strLong(String str1,String str2){
        if (str1.length() > str2.length())return str1;
        else return str2;
    }
    static void sumArrHigher(int [] arr1,int [] arr2){
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        if (sum1 > sum2) {
            System.out.println(Arrays.toString(arr1));
        } else {
            System.out.println(Arrays.toString(arr2));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        //        .1
        String a = s.next();
        if (a.equals(a.toUpperCase())){
            System.out.println("Capital");
        }
        else if (a.equals(a.toLowerCase())){
            System.out.println("Lower");
        }
        System.out.println(strLong("tal","itay"));

//        //.2
        int num = s.nextInt();
        int [] arr = new int[10];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = (int) (Math.random()*11);
            if (arr[i] == num){
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(arr));
        //.3
        sumArrHigher(new int[]{ 1, 3, 100 }, new int[]{80, 90, 99});
//        //.4
        JavaOperators.findFruit("cucumber");
        JavaString.printFirstLast("Ben.Meir");

        int num1 = (int) ((Math.random()*5)+1);
        int num2 = (int) ((Math.random()*5)+1);
        JavaMath.checkNumber(num1 ,num2);
        JavaLoops.loop();
        BreakAndContinue.shuffleArr();
        JavaMethod.checkHowToPay();
        JavaArray.arr();
    }
}