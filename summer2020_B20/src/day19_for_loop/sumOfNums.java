package day19_for_loop;

import java.util.Scanner;

/*
    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275

 */
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
public class sumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 0){

            for(int i = 1; i <= num; i++){
                // sum = sum + i;
                sum += i;
            }

            System.out.println(sum);

        }else{
            System.out.println("Invalid Entry");
        }



    }


}
