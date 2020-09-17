package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);

        System.out.println(circle.calculateArea()); //28.26

        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println(rectangle.calculateArea()); // 12.0

        System.out.println(circle.calculatePerimeter()); // 18.84
        System.out.println(rectangle.calculatePerimeter()); // 14.0

    }



}
