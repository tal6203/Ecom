package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String clear(String toClear){
        var tca = toClear.toLowerCase().toCharArray();
        String alphanumerics = "qwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder sb = new StringBuilder();
        for(char c : tca){
            if(alphanumerics.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static Boolean checkpalindrome(String inpt){
        String clearInput = clear(inpt);
        var clearInputArr = clearInput.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = clearInputArr.length-1; i >= 0 ; i--) {
            sb.append(String.valueOf(clearInputArr[i]));
        }
        String res = sb.toString();
        return clearInput.equals(res);
    }

    public static void checkTarget(int [] arr, int target){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] + arr[i+1] == target){
                System.out.format("[%d, %d]",i,i+1);
            }
        }
    }

    public static int findMostFrequentElement(int [] arr){
        int result = 0;
        int maximum_count = 0;
//  1.      for (int i = 0; i < arr.length; i++){
//            int count = 0;
//            for (int j = 0; j < arr.length; j++){
//                if (arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if (maximum_count < count){
//                maximum_count = count;
//                result = arr[i];
//            }
//        }
//        return result;

//  2.
        int count = 0;
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i + 1]){
                count++;

            }
            else {
                if (maximum_count < count){
                    maximum_count = count;
                    result = arr[i];
                }
                count = 0;
            }
        }
        return result;
    }

    public static void checkSubstring(String str){
        int maxLength = 0;
        String longStr = "";
        for (int i = 0; i < str.length(); i++){
            String temp = "";
            for (int j = i; j < str.length(); j++){
                if (temp.indexOf(str.charAt(j)) < 0){
                    temp = temp + str.charAt(j);
                }
                else {
                    break;
                }
            }
            if (maxLength < temp.length()){
                maxLength = temp.length();
                longStr = temp;
            }
        }
        System.out.format("The answer is : %s ,with the length of %d",longStr,maxLength);
    }

    public static void main(String[] args) {
//        Rectangle myRect = new Rectangle();
//        myRect.width = 40;
//        myRect.height = 50;
//        System.out.println("myRect's area is " + myRect.area());


        Student student1 = new Student("Sam",12,"052-4567895","HOLON");
        Student student2 = new Student("John",7,"050-7891236","TEL-AVIV");

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        Rectangle rectangle1 = new Rectangle(5,4);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());


//        Scanner scanner = new Scanner(System.in);
//        Average average = new Average(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//        average.getAvg();

        EmployeePrint employee1 = new EmployeePrint("Robert",1994,20236f,"Holon");
        EmployeePrint employee2 = new EmployeePrint("Sam",2000,10569f,"Tel-Aviv");
        EmployeePrint employee3 = new EmployeePrint("John",1999,15354f,"Ashdod");

        employee1.printEmployee();
        System.out.println("");
        employee2.printEmployee();
        System.out.println("");
        employee3.printEmployee();
        System.out.println("");

        // HEAP - order,orderItem,customerName,itemName, orderId, orderIdItem - All variables are objects.
        // STACK - The functions and pointers of the objects.
        // 300
        // 5000
        // 5000


        String s = "A man, a plan, a canal: panama";
        System.out.println(checkpalindrome(s));

        System.out.println("");
        int [] nums = {3,3};
        int target = 6;
        checkTarget(nums,target);

        System.out.println("");
        int [] arr = {10,20,10,20,30,20,20};
        System.out.println(findMostFrequentElement(arr));

        checkSubstring("pwwkew");

    }
}