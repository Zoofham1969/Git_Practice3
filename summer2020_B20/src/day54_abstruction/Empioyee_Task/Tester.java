package day54_abstruction.Empioyee_Task;

import java.time.LocalDate;

public final class Tester extends Employee { // can be a sub class not a super class

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary ){
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+" found a bug");
    }


}






