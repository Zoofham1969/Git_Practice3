package day11_Nestedif_Switch;

public class Ternary_pratice2 {
/*public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
 */

    public static void main(String[] args) {
    int num = 100;
    String result ="" ;
    if (num> 0){
        result = "positive";
    } else if (num <0){
        result = "Negative";
    } else {
        result = "Zero";
    }

String result2 = (num> 0) ? "positive" :(num <0) ?"Negative" :"Zero";

        System.out.println(result);
        System.out.println(result2);
        System.out.println("===============================");
int a =10;
 int b = 20;

 String r = (a > b ) ? "a is smaler" : ( b > a ) ? "b is greayer": "a is equal to b";
        System.out.println(r);












    }
}
