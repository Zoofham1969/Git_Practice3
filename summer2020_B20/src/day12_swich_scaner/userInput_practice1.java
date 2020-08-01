package day12_swich_scaner;

import java.util.Scanner;

public class userInput_practice1 {

    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        double num = scan.nextDouble();
     String  result =(num %2==0)?num+ " is even number" :num+"is odd number";

        System.out.println(result);





    }










}
