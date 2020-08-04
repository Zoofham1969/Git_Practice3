package day12_swich_scaner;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;//only import scanner class from java.util
//import java.util.*;//import every thing from java.until


public class userInput {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
      //  int num1 = input.nextInt();
      //   long num2 = input.nextLong();

       double num3 = input.nextDouble();


        System.out.println("you entered " +num3);


    }






}
