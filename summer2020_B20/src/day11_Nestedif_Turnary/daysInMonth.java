package day11_Nestedif_Turnary;
/*    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
*/
public class daysInMonth {
    public static void main(String[] args) {

        int month =20;
        boolean vaildNumber = month >= 1 && month <= 12;


        boolean days28 = month == 2;//for the month has 28 days

        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        //for the month has 30 days

        boolean invalid = month < 1 || month > 12;

        String result = "";

        if(vaildNumber){ // for 28 days or 30 days or 31 days

            if(days28){
                result = "28 Days";
            }else if(days30){
                result ="30 Days";
            }else{
                result = "31 Days";
            }

        }else{ //Invalid Month
            result = "Invalid";
        }

        System.out.println(result);




    }





}
