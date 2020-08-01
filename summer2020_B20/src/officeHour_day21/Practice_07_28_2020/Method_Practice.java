package officeHour_day21.Practice_07_28_2020;

public class Method_Practice {

    //Access-Modifier Specifier Return-type Name(Parameter){Statements}

    public static void main(String[] args) {
       String name = "Muhtar" ;

            String reversName =reversStr(name) ;
        System.out.println(reversName);
    }



    public static String reversStr(String str){//ABC
        String result = ""; // CBA

      for (int i = str.length()-1; i>=0 ; i--) {
             result+=str.charAt(i); //C  B  A

      }

      return result;





    }


public static void isPalindrome(String str){ //ABC

    String reversedStr = reversStr(str) ;//CBA

    boolean palindrome = str.equalsIgnoreCase(reversedStr);

    System.out.println(palindrome?str+"is palindrome" :str+"Is not palindrome");



    }




}
