package day07_Unary_ShortHand;
/*   1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year


 */
public class leap_Year {

    public static void main(String[] args) {
      int year = 2040 ;

     boolean result =year % 4 == 0 ;

        System.out.println("year "+year +" is leap year:"+result);




    }

}