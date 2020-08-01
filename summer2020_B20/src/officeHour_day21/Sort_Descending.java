package officeHour_day21;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

    7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the desending order of the original array
 */
public class Sort_Descending {
    public static void main(String[] args) {

        int[] arr = {2 , 1, 3} ;
        Arrays.sort(arr) ;

        System.out.println(Arrays.toString(arr));



    }



}
