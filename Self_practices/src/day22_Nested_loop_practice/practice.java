package day22_Nested_loop_practice;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

     int max = -2147483648 ;

     for(int q =10; q <= 60 ; q += 5 ){
         System.out.println("Enter a number");

    int num = scan.nextInt();
    if( num > max){
        max = num ;
    }



     }

        System.out.println("max number: " + max);




    }


}
