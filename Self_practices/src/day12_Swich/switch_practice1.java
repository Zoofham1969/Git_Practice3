package day12_Swich;

public class switch_practice1 {

    public static void main(String[] args) {
    /*
        long c = 10;    we can not use these in the switch .
        float f = 10;
        double d = 10;
        boolean h = true;
    */



        int num = 4;

    String result = "";

        switch(num){

            case 1:
            result = "Monday" ;      //     System.out.println("Monday");
                    break;

            case 2:
                result = "Tuesday" ;   //System.out.println("Tuesday");
                break;

            case 3:
                result = "Wednesday" ;  //System.out.println("Wednesday");
                break;

            case 4:
                result = "Thursday" ;  //System.out.println("Thursday");
                break;

            case 5:
                result = "Friday" ;   //System.out.println("Friday");
                break;

            case 6:
                result = "Saturday" ;  //System.out.println("Saturday");
                break;

            case 7:
               result = "Sunday";  // System.out.println("Sunday");
                    break;

            default:
                result = "Invalid" ;   //System.out.println("Invalid");



        }


        System.out.println(result);


    }

}
