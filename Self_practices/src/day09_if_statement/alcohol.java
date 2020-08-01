package day09_if_statement;
/*
        4. write a java program that can identify if a
        person is eligible to buy alcohol

        */
public class alcohol {

    public static void main(String[] args) {
     boolean hasId = true ;
    int age  = 15 ;
   boolean eligible = hasId && age >=21 ;
   String result = "" ;

   if(eligible == true){
       // System.out.println("Eligible to buy alcohol");
    result = "Eligible to buy alcohol" ;
   }

    if(eligible == false ) {
        // System.out.println("go buy milk");
        result = "go buy milk";
    }
        System.out.println(result);


    }


}
