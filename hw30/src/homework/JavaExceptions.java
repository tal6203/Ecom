package homework;

public class JavaExceptions {
    static int checkTitle(String jobTitle){
    switch (jobTitle){
        case "Fullstack":
            return 22000;
        case "Backend":
            return 20000;
        case "Frontend":
            return 18000;
        default:
            throw new IllegalArgumentException("The provided job title is unsupported");

    }
    }
    static void salaryInFiveYears(String name,String titleJob,int salary){
        int salaryInFive = (salary * 12)* 5;
        System.out.format("Hello %s, with the job title %s you will earn in 5 years: %d shekels",name,titleJob,salaryInFive);
    }


}
