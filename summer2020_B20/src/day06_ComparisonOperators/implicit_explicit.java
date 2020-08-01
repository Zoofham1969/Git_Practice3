package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
       short s1 = 100 ;
       long l1 = s1;//  implicit casting:
                //================================
        // smaller to the bigger
        long l2 = (long)s1;
        int i1 = 300 ;
        double D1 = i1 ;
        System.out.println(D1);
        System.out.println("=================================");


    double d1 = 400.5555 ;

    int  I1 = (int)d1 ;//explicit casting
       //bigger to the smaller data tipe
        //=====================================
        System.out.println(I1);// 400
    long L1 = 4400 ;
    short sh1 =(short)   L1  ;
        System.out.println(sh1);

        int n1 = 1000 ;

    double m1 = 34.5 ;
    float  f1 = (float) m1 ;
        System.out.println(f1);

      long r1 = -500 ;
      int p1  =(int) r1 ;
        System.out.println(p1);
    long r2 = 13 ;
    byte t1 = (byte) r2 ;
        System.out.println(t1);







    }




}
