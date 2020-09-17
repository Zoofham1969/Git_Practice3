package day51_Exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {


        System.out.println("Hello");
     try {
         Thread.sleep(5);

     }catch (InterruptedException e){

     }




        System.out.println("World");
    try {
        Thread.sleep(3);

    }catch (InterruptedException e){

    }
        System.out.println("How are you");

    }

    public static void sleep(int second){
       try {
           Thread.sleep(second*1000);

       }catch (InterruptedException e){

       }

    }


}
