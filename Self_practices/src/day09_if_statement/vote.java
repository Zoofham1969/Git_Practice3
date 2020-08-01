package day09_if_statement;

public class vote {

    public static void main(String[] args) {

      int  age = 15 ;

       boolean usCitizen = true ;

       if(age >= 18 && usCitizen){
           System.out.println("Eligible to vote");
       }else {
           System.out.println("Not eligible to vote");
       }


    }

}
