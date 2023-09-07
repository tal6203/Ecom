package targilim;

import java.util.Arrays;

public class JavaString {
    static void printFirstLast(String fullName){
        String [] arr = fullName.split("\\.");
        String firstName = arr[0];
        String lastName = arr[1];
        System.out.format("Welcome to the course: your first name is: %s and your last name is: %s",firstName,lastName);
        int index = fullName.indexOf(".")+1;
        System.out.println("");
        System.out.format("The index where your last name started is: %d",index);
        System.out.format("Welcome to the course: your last name is: %s",lastName);
        String sentence = String.format("Welcome to the course: your first name is: %s",lastName);
        System.out.println(sentence.contains(lastName) ? "true" : "false");
        }

    }

