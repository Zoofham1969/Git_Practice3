package day54_abstruction.Car_Tasks;
/*

    Car: abstract
        start();
    BMW
        start(): push start button
    Tesla
        start(): voice control
    Toyota
        start(): Insert the key
    Jeep
        start(): jump start

 */

    public abstract class Car { // cannot be final

        public Car(){

        }

        public abstract void start();


    }


    final class A{  // can be final

    }

    class B{
        public static void main(String[] args) {
            A obj1 = new A();
            // Car obj2 = new Car();
        }
    }



