package day18_forLoop;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      String email = "cybertek@gmail.com";
        //              012345678
   int index1 = email.indexOf("@");
int index2 = email.lastIndexOf(".");


     email.substring(index1, index2);
String domain = email.substring(index1+1, index2);
        System.out.println(domain);




    }





}
