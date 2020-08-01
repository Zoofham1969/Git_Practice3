package day34_WrapperClass;
import java.util.ArrayList;

public class List_Intro {


    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();

      scores.add(95); //autoboxing  0  index
        scores.add(100);        //  1   index
        scores.add(85);         //  2
          scores.add(75);       //  3
        scores.add(1, 65);   //1


         //scores.add(6, 55); you can not do that
        System.out.println(scores);

    // 100
        System.out.println(scores.get(2));



    }

}
