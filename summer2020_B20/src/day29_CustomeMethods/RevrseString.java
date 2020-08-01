package day29_CustomeMethods;

public class RevrseString {

    public static void main(String[] args) {

       revers("Mahfooz");



    }


    public static void revers(String str){
      String result = "" ;
    for(int i = str.length()-1 ; i>= 0 ;i--) {
        result += str.charAt(i) ;
    }
      System.out.println(result);


  }










}
