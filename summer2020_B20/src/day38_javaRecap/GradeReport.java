package day38_javaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(100, 90, 85, 55, 45, 73, 35, 47, 60,87, 77,75, 67, 57, 47, 93, 83, 73, 53, 43, 63));

        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();// 90~100
        gradeA.addAll(list);// first store all the grades
       gradeA.removeIf(each ->each< 90);// second remove the grades that are not A.
                //only retain the grades of A
        System.out.println("Grade A: " + gradeA);


        ArrayList<Integer> gradeB = new ArrayList<>();   //  80~89
        gradeB.addAll(list);// first store all the grades
        gradeB.removeIf(p -> p < 80 || p > 89);// second remove the grades that are not B (f d c a )
        System.out.println("Grade B: " +gradeB);
                // if the grade is either less than 80 or greater 89 should be remove


        ArrayList<Integer> gradeC = new ArrayList<>(); //70~79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p <70 || p >79);

        System.out.println("Grade C: " + gradeC);



        ArrayList<Integer> gradeD = new ArrayList<>();  // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf(p -> p <60 || p >69);
        System.out.println("Grade D: " + gradeD);




        ArrayList<Integer> gradeF = new ArrayList<>(); //0 ~ 59
        gradeF.addAll(list);
        gradeF.removeIf(p -> p >59 );

        System.out.println("Grade F: " + gradeF);



    }



}
