package officeHour_day21.practice_07_21_2020;
import java.util.Arrays ;
public class rray_desc2_I_Q {
/*
	1. Arrays: Descending order
		solution 1: for loop
		solution 2: for each loop ( you need extra variable for index number)
*/
    public static void main(String[] args) {
       int[] arr = {98, 97, 100, 200, 55, 68} ;

        Arrays.sort(arr);//[55, 68, 97, 98, 100, 200 ]

        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];

        int k= arr.length-1;
        for( int each: arr){ // 55, 68, 97, 98, 100, 200
            descArr[k] = each;
            k--;
        }

        System.out.println(Arrays.toString(descArr));




    }




}
