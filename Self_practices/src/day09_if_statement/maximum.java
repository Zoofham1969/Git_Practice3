package day09_if_statement;
/*
/*    1. write a java program that accepts three numbers
and return the maximum number
                (assume that none of them are equal)

 */
public class maximum {

    public static void main(String[] args) {

     double a = 600 ;
     double b = 400 ;
     double c = 1000 ;


     boolean aIsMax = a> b && a > c ;

    boolean bIsMax = b >a && b > c ;
    //    aIsMax == false && B > c ;

    boolean cIsMax = c > a && c > b ;
    // aIsMax == false && bIsMax == false ;
    // !aIsMax && !bIsMax ;
        double max = 0 ;

        if(aIsMax){
      //  System.out.println(a);
    max= a ;
    }

    if(bIsMax){
     //   System.out.println(b);
    max = b ;
    }
    if(cIsMax){
      //  System.out.println(c);
    max = c ;
    }

        System.out.println(max + " is maximum number");
    }


}
