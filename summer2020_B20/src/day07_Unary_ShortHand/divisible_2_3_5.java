package day07_Unary_ShortHand;
/*    2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
Collapse
*/
   public class divisible_2_3_5 {
       public static void main(String[] args) {
           int number = 25;

        boolean divisible2 = number % 2 == 0 ;

        boolean divisible3 = number % 3 == 0 ;
        boolean divisibie5 = number % 5 == 0 ;

           System.out.println(number +" is divisible by 2; "+ divisible2);
           System.out.println(number +" is divisible by 3; "+divisible3);
           System.out.println(number +" is divisible by 5; "+divisibie5);



       }


}
