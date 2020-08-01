package officeHour_day21._07_14_20;

public class Unique_Char {
    public static void main(String[] args) {

        String str = "ABABCDDEFFGHHIJJK";
        String expectedResult = "";  // "C"

        // str = "ABABC";
                    //j<=str.length()-1 \\
        for(int j = 0; j < str.length() ; j++){

            char ch = str.charAt(j); // A B A B C
            int count = 0 ; // frequency of ch
                        // i <=str.length()-1 \\
            for(int i = 0; i < str.length(); i++){  //helps us to calculate the frequency of ch and assign it to count
                char each =  str.charAt(i);
                if(each == ch){
                    count+=1;
                }
            }

            if(count == 1){
                expectedResult += ch;
            }

        }



        System.out.println(expectedResult);









    }





}
