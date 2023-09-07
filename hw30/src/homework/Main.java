package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String candidateName = s.next();
        String candidateJob = s.next();

try{
    int salary = JavaExceptions.checkTitle(candidateJob);
    JavaExceptions.salaryInFiveYears(candidateName,candidateJob,salary);
}
catch (Exception e){
    System.out.println(e.getMessage());
    System.out.format("Hello %s,the job title you provide %s is unknown to us, so we can’t calculate your salary in 5 years",candidateName,candidateJob);
}

    }
}