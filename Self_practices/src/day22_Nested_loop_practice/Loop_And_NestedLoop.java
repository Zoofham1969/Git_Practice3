package day22_Nested_loop_practice;

public class Loop_And_NestedLoop {

    public static void main(String[] args) {



      for(int j = 1  ; j <= 10 ; j++) {


          for (int i = 1; i <= 15; i+= 2) {
              System.out.print(i + " ");
          }


          System.out.println();

      }
        System.out.println("===============");
    for(int a =7 ;a >= 1 ; a--){

        for(int p = a ; p >= 1 ; p --){
            System.out.print(" @");
        }

        System.out.println();


    }

        System.out.println("============================");
    for(int z = 1 ; z <= 8 ; z++){

    for( int x=z ; x <= 8 ; x ++){
        System.out.print(" %");
    }


        System.out.println();
    }

        System.out.println("===========================");

    for(int s = 1; s <= 5; s ++){

    for(int v= s ; v<= 5; v ++){
        System.out.print(" ?");
    }


        System.out.println();
    }








    }

}
