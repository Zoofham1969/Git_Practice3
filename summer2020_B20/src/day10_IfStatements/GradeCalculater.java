package day10_IfStatements;
/*
grade: int score = 95;
    score < 0 || score > 100 ==> Invalid
	90 ~ 100 ==> A
	80 ~ 89 ==> B
	70 ~ 79 ==> C
	60 ~ 69 ==> D
	otherwise ==> F
 */

public class GradeCalculater {

    public static void main(String[] args) {

        int score = 120;
        String grade = "";


        if (score <= 100 && score >= 90) {
         grade = "A";
        }else if(score <=89 && score >=80){
            grade = "B";
        }else if (score <= 79 && score >=70){
            grade = "C";
        }else if (score <= 69 && score >= 60){
            grade = "D" ;
        }else if (score <=59 && score >= 0){
            grade = "F" ;
        }else{
        grade = "Invalid score" ;


    }
        System.out.println(grade + " is  score");



    }

}