package day16_String;

public class string_method {

    public static void main(String[] args) {
  /*  1- String idex starts all the time from the zero(0).
      2- minimum namber in the String is zero(0).
      3-index number in String all the time is in { integers}= int.
   */
        /*String methods:
    replace(old value, new value): new value will be replaced with all the old values. returns new string
        String str1 = "I like to learn Java, Java is cool"
         STring str2 =   str.replace("Java", "C#");  // "I like to learn C#, C# IS cool"
 */
        // String replace method :
    //   replace():

        String email = "cybertek@gmail.com";

        email = email.replace("gmail", "yahoo"); // "cybertek@yahoo.com"

        System.out.println(email);


        String word = "java";
        word =   word.replace("a", "e");  // "jeve"

        System.out.println(word);

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java" , "a, C#");

        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";  //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace("R", "r");  // "I like to learn Java"

        System.out.println(s2);
        System.out.println("===========================");
     //     replaceFirst() :
/*String methods:  replaceFirst() :
    replace(old value, new value): new value will be replaced with all the old values. returns new string
        String str1 = "I like to learn Java, Java is cool"
         STring str2 =   str.replace("Java", "C#");  // "I like to learn C#, C# IS cool"
*/

        System.out.println("===================================");
     // String IndexOf() :
/*    indexOf(value): returns the index number of first occured character. as an int
        String str = "Cybertek";
                str.indexOf("r") ==> 4
*/


        System.out.println("===================================");
     //     lastIndexOf() :
/*    lastIndexOf(value): returns the index number of last occured character. as an int

* */



    }




}
