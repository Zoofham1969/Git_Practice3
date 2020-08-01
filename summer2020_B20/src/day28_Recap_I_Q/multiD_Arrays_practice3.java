package day28_Recap_I_Q;
import java.util.Arrays ;
public class multiD_Arrays_practice3 {
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

        int[][] arr2D = {{1,2,3}, {4,5}};

        //                      0      1         0         1
        int[][][] arr3D = { {{1,2,3},{4,5}} , {{6,7,8}, {9,10}}   };
        //                          0               1

        System.out.println(Arrays.deepToString(arr3D));

        // {{6,7,8}, {9,10}}
        System.out.println(  Arrays.deepToString( arr3D[1] )   );

        // {4,5}
        System.out.println( Arrays.toString( arr3D[0][1] ) );

        //8
        System.out.println( arr3D[1][0][2] );

        System.out.println("==========================================");

        for(int i =0; i <=arr3D.length-1; i++){ //i: index of 2D arrays
            int[][] each2D =  arr3D[i];
            for(int j = 0; j <= each2D.length-1; j++){ //j: index of 1D array
                int[] each1D = each2D[j];
                for(int k = 0; k <= each1D.length-1; k++ ){//k: index of elements
                    System.out.print(each1D[k]+" ");
                }
                // System.out.println();
            }
            System.out.println();
        }

        System.out.println("============================================");

        for(int[][] each2D : arr3D ){
            for(int[] each1D : each2D ){
                for(int eachElement : each1D){
                    System.out.print(eachElement+" ");
                }
            }
            System.out.println();
        }







    }



}
