package day15String;


import org.w3c.dom.ls.LSOutput;

public class Sring_methods {
    public static void main(String[] args) {


    /*task:
    write a program that ask user to enter sentence.
        then print out the first and last characters
*/
//length ==> int
        String name = "I am from Afghanistn";
        int l = name.length();

        //last index: length of String - 1;

        int lastIndexNumber = name.length() - 1;

        System.out.println(lastIndexNumber);

        System.out.println(l);
     char lastChar = name.charAt(lastIndexNumber);



        System.out.println(lastChar);
        System.out.println();



    }


}
