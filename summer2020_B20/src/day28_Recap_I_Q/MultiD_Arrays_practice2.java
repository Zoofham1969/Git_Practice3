package day28_Recap_I_Q;
/*

task:
            int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                4 5 6 7 8
                9 10, 11 12 13
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */
import java.util.Arrays ;
public class MultiD_Arrays_practice2 {

    public static void main(String[] args) {
/*

single dimensional array:

        int[] arr = {1,2,3,4}
            [index of elements]
            Arrays.toString(): for single dimensional array ONLY
multi-Dimensional arrays: contains multiple arrays
        each array and each elemnt has index number
        n dimensional array contains (n-1) dimensional array
        2D array: contains 1D arrays
            [index of 1D Array][index of Elements]
            Arrays.deepToString(): for multi-D Arrays ONLY

 */

        //                 0 1 2      0 1 2 3 4      0 1  2  3  4
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //                  0            1               2
        /*
         task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */

        for(int i = arr2D.length-1; i >=0; i-- ){
            int[] arr1D = arr2D[i];
            for( int j = 0; j <= arr1D.length-1; j++ ){
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
        }

        System.out.println("=======================================");
        /*
        task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
         */

        for(int i= 0; i <= arr2D.length-1; i++){
            int[] arr1D = arr2D[i];
            for(int j = arr1D.length-1; j >= 0; j--){
                System.out.print( arr1D[j] +" ");
            }
            System.out.println();
        }

        System.out.println("=============================================");
        /*
        task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
         */

        for(int i = arr2D.length-1; i >=0 ; i-- ){
            int[] arr1D = arr2D[i];
            for(int j=arr1D.length-1; j >= 0; j-- ){
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
        }





    }


}
