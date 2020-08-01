package day09_if_statement;
/*
3. write a java program that accepts three numbers and
     rteurn the mediam number
 */
public class mediumNumber {

    public static void main(String[] args) {
    double a = 10000 ;
    double b = 250 ;
    double c = 200 ;

  boolean aIsMed = (a> b && a <c) || (a < b && a >c) ;

    boolean bIsMed = (b > c && b < a) || (b < c && b > a);
    boolean cIsMed =  !aIsMed && !bIsMed ;
     //     cIsMed = !aIsMed && !bIsMed ;


    double med = 0 ;

    if(aIsMed){
        med = a ;
    }
    if(bIsMed){
        med = b ;
    }

   if(cIsMed){
       med = c ;
   }

        System.out.println(med + " is the medium");

    }


}
