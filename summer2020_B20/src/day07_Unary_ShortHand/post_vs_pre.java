package day07_Unary_ShortHand;

public class post_vs_pre {
    public static void main(String[] args) {

        int a = 10 ;
        System.out.println(++a);// 11
        System.out.println(a); //11

        System.out.println("==============================");

    int b = 10;
        System.out.println(b++);// 10
        System.out.println(b);  // 11

        System.out.println("====================================");

      int  c = 25;
      int d = c++;      //25
        System.out.println(c);

        System.out.println(d);
        System.out.println("==================================");

    int e = 25 ;
    e++ ;
        System.out.println(e);  //26

        System.out.println("=================================");

   int x = 8 ;
    int   y   =x-- ;   //8

        System.out.println(x);  //7
    int s= 2 ;
    int f = s++ ;
        System.out.println(s);
        System.out.println(f);
        System.out.println("==================================");
        int A = 1 ;
        A = -A-- + A++ / -A-- * --A ;

    //A  =  -1 + 0  / -1 * -1
   //A =  -1 + 0 *  -1
    //A = -1 + 0 = -1


        System.out.println(A);//-1

        System.out.println("===================================");

    int z = 50 ;

    z = --z + z++ + z-- + z++ ;
// z = 49 +   49 + 50  + 49
 // z= 197

        System.out.println(z); // 197
        System.out.println("============================");

    int v = 4 ;
    int g = v * 4 - v++ ;
    // g = 4 * 4 - 4  = 12


        System.out.println(g);//12



    }

}
