package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
 boolean r1 = 10 > 9;
        System.out.println(r1);

boolean r2 = 100 < 9000;
        System.out.println(r2);

        //  >= : greater or equal
        //========================
       boolean r3 = 87 >= 85 ;
        System.out.println(r3);

        boolean r4 = 877>= 878 ;
        System.out.println(r4);

        // <= : less than or equal
       //===========================
        boolean r5  = 200<= 300 ;
        System.out.println(r5);

        // == : equal
        boolean r6 = 900 == 800 ;
        System.out.println(r6);
 //
        boolean r7 = false; //false
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good guy" ; // fales

        boolean r9 = "Muhtar"  == "Muhtar" ; // true
        System.out.println(r8);

        System.out.println(r9);

        // boolean r10  = "123" == 123 ;

    boolean r11 = "muhta" != "Bad Guy";
        System.out.println(r11);

        boolean r12 = true != false ;
        System.out.println(r12);

        boolean result1 = 'A' == 65 ;//true
        System.out.println(result1);

      boolean result2 = 100 == 100.0 ;// true
        System.out.println(result2);

   boolean result3 = "100" == "100.0" ; //falls
        System.out.println(result3);

        int number = 101 ;
        boolean even = number % 2 == 0 ;
        boolean odd = number % 2 != 0 ;

        System.out.println(even);
        System.out.println(odd);
        System.out.println("=========================================================== ");

        // = : assigns valuye to variable

    //    == : equal returns boolean

   //  even : 100 % 2 == 0
  //=============================

        // odd : 100 % 2 != 0
        //===============================
    int x = 1000 ;

    // odd : x % 2 != 0 ====> false
        System.out.println(x % 2 != 0);

    //even : x % 2 == 0 ===> true

    //divisible by 3 : x % 3 == 0 ===> false

     //divisible by 5 :     x % 5 == 0 ====> true

        // divisible 10 : x % 10 == 0 ===> true

       //
    }








}

