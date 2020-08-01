package day05_Arthematic_operators;

public class Employee_info2 {
    public static void main(String[] args) {

        String firstName = "Luba";
        String lastName = "Parwani";
        char gender = 'F';
        int age   = 42;
        String companyName = "Chase Bank";
        String jobTitle   = "Tester";
        boolean isFullTime = true;
        boolean isMarried = true;
       double salary = 120_000.50;
        String fullName =  firstName +" "+lastName ;

       System.out.println("Employee full is: " + fullName );
        System.out.println( fullName +"' gender is : " +gender);
        System.out.println(fullName +" " + age+ " years old");
        System.out.println(fullName +" works at: " +companyName);
        System.out.println(fullName+" job title is:" + jobTitle);
        System.out.println(fullName+" salary is: $"  +salary);
        System.out.println(fullName + " is full time employee:"+isFullTime);
        System.out.println(fullName + " is married: "+ isMarried);









    }







}
