package day09_if_statement;
/*
  2. write a java program that accepts three numbers and
    return the minimum number
                (assume that none of them are equal)
 */
public class minimum {

    public static void main(String[] args) {

        double a = 10 ;
        double b = 300 ;
        double c = 100 ;
 boolean aIsMin = a<b && a <c ;
  boolean bIsMin =aIsMin == false && b < c ;
    boolean cIsMin = aIsMin == false && bIsMin == false ;

   double min = 0 ;

    if(aIsMin){
        min = a ;
    }
    if(bIsMin){
        min= c ;
    }
    if( cIsMin){
        min = c ;
    }
        System.out.println(min + " is the minimum number");


    }

}
