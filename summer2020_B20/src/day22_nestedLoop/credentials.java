package day22_nestedLoop;

import java.util.Scanner;

/*

1. Write a program that asks user to enter his/her username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account
next topic: nested loop

 */
public class credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");

        String u = scan.next();

        System.out.println("Enter your password");
    String p = scan.next();
        int attempt = 1;

        while(  !(u.equals("cyber") && p.equals("tek123"))  ){

            if(attempt > 2){
                System.out.println("Your account is locked");
                System.exit(0);
            }

            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println("Enter your user name");
            u = scan.next();

            System.out.println("Enter your password");
            p = scan.next();


            attempt++;
        }


        System.out.println("Logged in");







    }


}
