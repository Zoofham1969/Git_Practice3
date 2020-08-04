package day11_Nestedif_Turnary;

public class Ternary_practice1 {
    public static void main(String[] args) {
  int age = 16;
  String citizen ="USA";
   String result = "" ;

  if (age >=18 && citizen == "USA"){
    result = "Can vote" ;
    }else {
      result = "Can not vote";
  }

        System.out.println(result);

String result2 = (age >=18 && citizen == "USA")?"can vote" :"can not vote" ;

        System.out.println(result2);

  System.out.println("======================================") ;

int n1 =200 ;
int n2 = 200;
String r = (n1 == n2)  ? "equal" : "not equal";
        System.out.println(r);






    }



}
