package day16_String;

import java.util.Scanner;

/*warmup tasks:
 *
        1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana
*/
public class Substrig_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
         String str1 = scan.next();//"apple"

        System.out.println("Enter your secon word");
        String str2 = scan.next();//"banana"

    //ppleanana
    // String result= str1.substring(1) + str2.substring(1);
        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);
/*public class substring_Practice {
    public static void main(String[] args) {
        // extra task:
            String str = "I like to drink Pepsi";
            String drink = str.substring(16);
            System.out.println(drink);

            String action = str.substring(10, 14 + 1);
        System.out.println(action);


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");


 */









    }





}
