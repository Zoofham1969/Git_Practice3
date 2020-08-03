package day12_Swich;
/*
  1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            NOTE: DO NOT USE IF STATEMENT
 */

public class BiggerNumber {

    public static void main(String[] args) {
    double n1 = 10;
    double n2 = 200;
    double n3 = 30;

   boolean n1IsBigger = n1 > n2 && n1 > n3;
   boolean n2IsBigger = n1<n2 && n2 >n3 ; // n1IsBigger == false && n2 > n1 ;
  // boolean n3IsBigger = n3> n2 && n3 > n1 ;// n1IsBigger== false && n2IsBigger == false ;
                                       //     !n1IsBigger      &&        !n2IsBigger ;
   String result = (n1 > n2 && n1 > n3)? "n1 is bigger" : (n1<n2 && n2 >n3)? "n2 is bigger" :"n3 is bigger";
/*
    if (n1 > n2 && n1 > n3){
        result = "n1 is bigger";
    }else if (n1<n2 && n2 >n3){
        result = "n2 is bigger";
    }else {
        result = "n3 is bigger";
    }
  */

        System.out.println(result);







    }



}
