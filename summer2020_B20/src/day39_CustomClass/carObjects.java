package day39_CustomClass;

public class carObjects {

    public static void main(String[] args) {

       Car car1 = new Car();
  /*          car1.brand = " Toyota";
        //    car1. = "Corolla";
            car1.year = 2020;
            car1.color = " White";
            car1.mileage = 20000;
           car1.price = 19000.5;
*/


    car1.setInfo("Toyota", "Corolla", 2010,
            "Red", 55000, 16000);



        System.out.println(car1.brand);
     //   System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);




        System.out.println("==================================");

        Car car2 = new Car();
 /*       car2.brand = "Mercedes";

        car2.mileage = 20000 ;
         car2.color = "blue";
        car2.year = 2020;


 */



        System.out.println(car2.brand);

        System.out.println(car2.year);
        System.out.println(car2.color);



    }

}
