package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Luba" ;
        String lastName = "Parwani" ;

        int age = 21 ;
        String citizen1 = "USA" ;
       String  citizen2 = "France";

       boolean eligibleAge = age >= 18 ;

    boolean usCitizen = citizen1 == "USA" || citizen2 == "USA" ;
    //                    USA == USA      || "France" == USA
    //                       true         ||    false
    //                  true

    boolean eligibleTOVote = eligibleAge && usCitizen ;
        //                      true     &&   true



    String fullName = firstName + " " + lastName ;

        System.out.println( fullName + " is eligible to vote for Trump:"+eligibleTOVote);



     }



}
