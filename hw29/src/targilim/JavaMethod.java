package targilim;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class JavaMethod {
static int needToPay(int computer,int screen,int mouse,int printer,int keyboard){
return computer + screen + mouse + printer + keyboard;
}
static void checkHowToPay(){
    int toPay = needToPay(2500,1200,250,500,350);
    Scanner s = new Scanner(System.in);
    System.out.println("How to pay?");
    String howToPay = s.next();
    switch (howToPay){
        case "cash":
            System.out.format("Please give %d shekels to the catchier",toPay);
            break;
        case "check":
            System.out.format("Please write a check for this amount %d and give it to the catchier",toPay);
            break;
        case "creditcard":
            System.out.format("Enter a Card validity (mm/yyyy)");
            String dateCard = s.next();
            int year = LocalDate.now().getYear();
            if (year > Integer.parseInt((dateCard.split("/")[1]))){
                System.out.println("Your credit card is not valid, please try to pay again with a different method");
        }
            else {
                int month = LocalDate.EPOCH.getMonthValue();
                if (month > Integer.parseInt((dateCard.split("/")[0]))){
                    System.out.println("Your credit card is not valid, please try to pay again with a different method");
                }
                else {
                    System.out.format("Your credit card was charged with %d shekels, thanks for buying!", toPay);
                }
            }
            break;
    }
}
}
