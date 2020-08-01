package day28_Recap_I_Q;
import java.util.Arrays ;
public class multi_D_Arrays {
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
    public static void main(String[] args) {
        int[] arr1D = {1,2,3};

        //                    0 1 2      0 1 2 3 4      0 1  2  3  4
        int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13}    };
        //                  0             1                2
        //  {4,5,6,7,8}
        System.out.println( Arrays.toString(arr2D[1] )  ) ;      // single dimensional int array

        System.out.println(   Arrays.deepToString( arr2D )  );

        // 7
        System.out.println( arr2D[1][3]  );

        System.out.println("====================================================");

        for(int i =0; i <= arr2D.length-1; i++){ // iterates each 1D array from arr2D
            int[] each1DArray  = arr2D[i];
            //System.out.println( Arrays.toString(each1DArray)  );

            for(int j =0; j<= each1DArray.length-1; j++ ){ // iterates the elements of each 1D array
                int eachNum = each1DArray[j];
                if(eachNum %2==0) {
                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();
        }

        System.out.println("=====================================================");

        for(int[] each1D  : arr2D ){
            for( int eachElement :  each1D ){
                if(eachElement % 2 != 0) {
                    System.out.print(eachElement + " ");
                }
            }

            System.out.println();
        }







    }


}
