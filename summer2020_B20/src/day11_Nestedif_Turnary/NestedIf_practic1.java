package day11_Nestedif_Turnary;

/*
 Task01:
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
 */



public class NestedIf_practic1 {
    public static void main(String[] args) {
 double salary = 12000;
 double jobHistory = 0.25;

    if (salary >= 30000){
       if (jobHistory >=2) {
           System.out.println("you are qualified");
       }else{
           System.out.println("You must have been on job at least 2 years");
       }



    }else
           System.out.println("you must earn at least $30K ");










    }






}
