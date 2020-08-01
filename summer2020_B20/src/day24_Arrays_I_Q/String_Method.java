package day24_Arrays_I_Q;
import java.util.Arrays ;
public class String_Method {

    public static void main(String[] args) {
/*String methods:

        String str = "ABCDE";
        toCharArray(): returns char array.
            str.toCharArray() ==>  ['A', 'B', 'C', 'D', 'E']
        split(value): retunrs String Array, splits the string by given valie
            String sentence = "Java is cool"
                    sentence.split(" ") ==> ["Java", "is", "cool"]
Data Structures:
        1. Array
        2. Collection
        3. Map
int[] arr = {1,2,3};

    for(int i= 0; i <= arr.length-1; i++){
    }
*/
        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println( Arrays.toString(ch ) );

        System.out.println("===========================");
        String str1 = "DCEBAF";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // [D, C, E, B, A]
        char[] ch2 = str2.toCharArray(); // [A, D, C, B, E]

        Arrays.sort(ch1); //[A, B, C, D, E]
        Arrays.sort(ch2); //[A, B, C, D, E]

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("==============================");
        String sentence = "I Love Programming Language";

        // Language Programming Love I

        String[] words =  sentence.split(" ");  // {I, Love, Programming, Language}
        System.out.println( Arrays.toString(words)  );

        for(int i = words.length-1; i >= 0; i-- ){
            System.out.print(words[i]+" ");
        }
        System.out.println();


        System.out.println("=====================================");

        String s = "JAVA";

        String[] arr =  s.split("");  // every single single elements are string
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray(); // every single single elements are char
        System.out.println(Arrays.toString(c));





    }


}
