package day12_swich_scaner;

public class Switch_1 {
    public static void main(String[] args) {


  /*   switch (num){
         case 1 :
             System.out.println("Monday");
            break;
         case 2:
             System.out.println("tuesday");
         break;
             case 3:

             System.out.println("Wednesday");
             break;

             case 4 :
             System.out.println("thursday");
               break;

         case 5 :
             System.out.println("Friday");
               break;

               case 6:
             System.out.println("Saturday");
               break;
         case 7:
             System.out.println("Sunday");
               break;


         default:
             System.out.println("Invalid");
*/
     // 1-  long c = 10; // 10L      YOU CANNOT USE THESE
      // 2- float f = 10;  //10.0f     ( 1, 2, 3, 4 )WITH
      //3-  double d = 10; // 10.0         SWITCH.
        // 4-  boolean g =10;// true/fals

        int num = 4;
        String result = "";

        switch(num){
            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";

        }


        System.out.println(result);








    }






    }






