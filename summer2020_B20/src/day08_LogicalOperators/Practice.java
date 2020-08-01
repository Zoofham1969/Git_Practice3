package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Mahfooz" ;
        String lastName = "Parwani" ;
        int age = 51 ;
        String citizenShip = "USA" ;
        boolean eligibleToVote  = age >= 18 &&  citizenShip == "USA";
            //                      19> 18   &&     == USA
            //                         true  &&    true


       String fullName = firstName +" " + lastName ;

        System.out.println(fullName);

        System.out.println(fullName + " is eligible to vote: " +  eligibleToVote);

    }



}
