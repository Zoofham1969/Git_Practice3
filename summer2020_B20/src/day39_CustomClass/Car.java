package day39_CustomClass;

public class Car {
    /*
    Attributes:
    model, brand year, color, mileage, VIN
    */

 String model;

 String brand ;
     int year ;
     String color ;
     double mileage;
     double price;

 public  void setInfo(String carBrand, String carModel,int carYear,
                      String carColor, double carMileage,double carPrice  ){

        brand = carBrand;
        model = carModel;
        year  = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;

// 2012 Toyota Corolla, red, 10000, 4500



 }




}
