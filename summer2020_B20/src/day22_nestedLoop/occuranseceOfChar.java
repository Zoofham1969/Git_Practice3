package day22_nestedLoop;

import java.util.Scanner;

/*

    2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class occuranseceOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int count = 0 ; // 1+1 = 2, frequency of ch in str

        for(int i=0; i <= str.length()-1; i++){

            char each = str.charAt(i);  // a  b a b c

            if( each == ch ){
                count += 1;
            }

        }

        System.out.println(count);

/*
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0; // 1+1 = 2, frequency of ch in str

        for (int i = 0; i <= str.length() - 1; i++) {

            //ababc
            char each = str.charAt(i);  // a  b a b c

            if (each == ch) {
                if (each == ch) {  // if true, means ch is occured in str
                    count += 1;
                }
            }

            System.out.println(count);


        }
*/

    }
}