package da07;
/*
 Positive_Negative_0
        Ex:
            number = 120.0
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 ii zero? false
 */
public class practice_1 {
    public static void main(String[] args) {

        double num = -7;

    boolean positive = num > 0 ;
    boolean nagative = num < 0 ;
    boolean zero = num == 0 ;

        System.out.println(num + " is a positive number? " + positive);
        System.out.println(num + " is negative number? " + nagative);
        System.out.println(num + " is zero? " + zero);

    


    }




}
