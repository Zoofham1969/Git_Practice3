package day15String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.SplittableRandom;

public class Substring_method {
    public static void main(String[] args) {
       String sentence = "Java is fun";
       //                 0123456789...

       //substring(beg index, end index):
       String word1 = sentence.substring(0 , 4);
        System.out.println(word1);
      String word2 = sentence.substring(8 ,11) ;
        System.out.println(word2);

        System.out.println("==================");
     String sentence2 = "I like movies and tv Series";
        String word3 = sentence2.substring(7,12+1);
        System.out.println();

        System.out.println("================");
  String firstName = " MAHFOOZ";
  String  firstCharactor = firstName.substring(0,1);
  String rest = firstName.substring(1,firstName.length());
//firsname.length():...


        System.out.println(firstName);

        System.out.println("===============");
    String lastName = "cYNTHIA";
    String firstChar = lastName.substring(0,1);//s
        String remaining = lastName.substring(1);//chool

      lastName = firstChar.toUpperCase() + remaining.toLowerCase();//"school"

        System.out.println(lastName);
        System.out.println("===================================");

    String s = "I like Game Of Thrones";
       //       01234567
       String series = s.substring(7);

        System.out.println( series );
       String s2 ="I Like Java Programming Language";
       //          01234567
        String language = s2.substring(7);
        System.out.println(language);


    }









}
