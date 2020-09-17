package day51_Exceptions;


class Test{
    int a ;  //200



}

public class SuperKeyword extends Test {
    //a = 300;

   public void print1() {
     //  System.out.println(this.a);
       System.out.println(a);  //SuperKeyword
   }
    public void print2() {//Test a==> 200
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 200;


        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 300;


       obj2.print1();
       obj2.print2();


    }


}
