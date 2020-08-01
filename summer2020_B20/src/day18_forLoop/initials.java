package day18_forLoop;

import java.util.Scanner;

public class initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    String firstName = scan.next();

    String lastName = scan.next();

    String initial = firstName.substring(0,1) +"." +lastName.substring(0,1);
    initial = initial.toUpperCase();

        System.out.println(initial);



    }






}
