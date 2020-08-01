package officeHour_day21;

import java.util.Scanner;

public class Maxmimum_july8_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


           int max = -2147483648;
   /*  for   loop
        for (int i =1 ; i <= 5 ; i++){

         System.out.println("enter number");
         int n = scan.nextInt();

          if (n>max){
              max = n ;
          }
        
        }
  */

     // while loop
      //=====================
      int j = 1;
             while(j <= 5){

                 System.out.println("Enter a number");
                 int n = scan.nextInt();

                 if(n > max ){
                     max = n;
                 }

                 j++;
             }



             System.out.println("max: "+max);


    }






}
