package day55_Abstruction;




    final class A{  // can create object from it
        int a = 10;
        static int b = 20;

        public void method1(){ }

        public static void method2(){}

        static{ }

        public A(){ }

        //  public abstract void method3();

    }

    abstract class B{ // can not create object from it, cannot be final
        int a = 10;
        static int b = 20;

        public void method1(){ }

        public static void method2(){}

        static{ }

        public B(){ }

        public abstract void method3();

    }








