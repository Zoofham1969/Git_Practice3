package day08_LogicalOperators;

public class if_statement {

    public static void main(String[] args) {
        int a = 100 ;
        int b = 100 ;


       if(a >b ){
           System.out.println( a+" is the maximum number");
       }


    if(b> a){
        System.out.println(b + " is the max number");
    }

    if(b==a){
        System.out.println("both are equal");
    }

        System.out.println("==================================");

    boolean breakTime = false;

    if(breakTime==true){
        System.out.println("take 15 min break");
    }

    if( breakTime == false){
        System.out.println("continue class");
    }
        System.out.println("==================================");
     boolean corona = false ;

    if(corona == true) {
        System.out.println("buy more toilet paper");
        System.out.println("Buy more hand sanitaizers");
        System.out.println("Social Distance");
        System.out.println("Stay at home");
    }

    if(corona == false){
        System.out.println("Have fun and enjoy your life");
    }


    }

}
