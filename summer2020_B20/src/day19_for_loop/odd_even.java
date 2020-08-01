package day19_for_loop;
/*
warmup tasks:
    1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5


 */
public class odd_even {
    public static void main(String[] args) {
        //1 3 5 7 9 11.....
        for (int i = 1; i < 100; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {

                System.out.print(i + " ");
            }
        }
        System.out.println();
/*for:
        for(init; condition; iterator){
                statements;
        }
        initialization (mandatory): starting point
        condition (mandatory) : ending point
        iterator : Co-related to the condition
                    eventually make the condition false, so that it exits the loop
loop without curly brace: can ONLY repeat one statement. cannot have more than one statement in loops body


 */
       for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) { // pre:i MUST be odd number
                if (i % 5 == 0 && i % 3 == 0) {//sub :MUST be divisible by 3&5

                    System.out.print(i + " ");
                }


            }
        }
           System.out.println();
        System.out.println("==================================");
       // Tasks :
        //0 2 4 6 8 10.....100
    for(int i = 0 ; i <= 100 ; i += 2) {

        if (i % 5 == 0 && i % 3 == 0) {


            System.out.print(i + " ");
        }
    }
        System.out.println();

    for(int i = 0 ; i <= 100 ; i++){
      if(i % 2 == 0) { // pre : i MUST be even
          if (i % 3 == 0 && i % 5 == 0) { //the number MUST be divisible byb3&5


              System.out.print(i + " ");

          }
      }

    }
        System.out.println();




    }

}
