package day04_variabies;
/*Task:
    create a class called CarInfo:
            Year
            Brand
            Model
            Mileage
            Price
            print the info of the car
            Ex:
                2020
                BMW
                X5
                30000
                45000
            output:
                2020 BMW X5, 3000 miles, $45000


 */
public class car_info {
    public static void main(String[] args) {
        int  year = 2018 ;
        String brand = "Toyota";
         String model = "Carola";
        int mileage  = 30000;
        String color = "red";
       double price  = 45000;
     //2018 Toyota Carola, 30000 miles, $45000

        System.out.println(year+" "+brand+", "+model+" "+color+", "+mileage +
        " miles, $" +price);



    }




}
