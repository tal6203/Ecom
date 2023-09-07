package targilim;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BreakAndContinue {
    static void shuffleArr(){
    String [] arr1 = {"computer","tv","table","chair","bed"};
    String [] arr2 = {"pizza","chips","spaghetti","sushi","hamburger"};
        Random rand = new Random();
        for (int i = 0 ; i < arr1.length; i++){
            int randomIndexToSwap = rand.nextInt(arr1.length);
            String temp1 = arr1[randomIndexToSwap];
            String temp2 = arr2[randomIndexToSwap];
            arr1[randomIndexToSwap] = arr1[i];
            arr2[randomIndexToSwap] = arr2[i];
            arr1[i] = temp1;
            arr2[i] = temp2;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Scanner s = new Scanner(System.in);
        String str = s.next();
        for (int i = 0 ; i < arr1.length ; i++){
            if (arr1[i].equals(str) && i == 0){
                System.out.format("The iteration was stop because i chose element: %s",str);
                break;
            }
        }
        for (int i = 0 ; i < arr1.length ; i++){
            if (arr1[i].equals(str) && i == 0){
                continue;
            }

        }
    }


}
