package targilim;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaMath {
    static void checkNumber(int num1,int num2){
        if (num1 == num2){
            System.out.format("The numbers are equals with value:%d",num1);
        }
        else {
            System.out.format("The numbers are not equals, first number value is: %d, and second number value is: %d",num1,num2);
        }
        System.out.println("");
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = dateTime.format(myFormat);
        System.out.println(formatDateTime);

    }
}
