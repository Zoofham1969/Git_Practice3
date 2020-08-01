package day29_CustomeMethods;

public class ReturnKeword {

    public static void main(String[] args) {

      grade(101) ;

        System.out.println("Task Completed");
    }




    // 6.culculate the grade of the student based on thescore

    public static void grade(int score){
    if(score <0 || score> 100) {
        System.out.println("Invalid score");
        return ;

    }
        char grade =(score >= 90)? 'A' : (score >=80)? 'B' : (score>=70)
                ? 'C' : (score>= 60)? 'D' : 'F' ;




    }





}
