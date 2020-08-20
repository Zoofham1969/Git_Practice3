package day42_Static;

public class StaticMethod {

    int a= 200 ;
    static  int b = 400;

    public static void main(String[] args) {

        System.out.println(b);
       // System.out.println(a);
       // System.out.println(this.a);


        StaticMethod obj = new StaticMethod();
        System.out.println(obj.a);
        // the ONLY way to call instance in a static method



    }




}
