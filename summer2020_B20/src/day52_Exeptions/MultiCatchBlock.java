package day52_Exeptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

      int [] arr = {10, 20} ;

      try{
          System.out.println(arr[20]);
      }catch (ArithmeticException e){
          System.out.println("Arithmetic Exception is handled");
      }catch (ClassCastException e) {
          System.out.println("Class cast Exeption");
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Array index out of bound Exception");

      }catch (IndexOutOfBoundsException e){
          System.out.println("Index out of bound exception");
      }catch (RuntimeException e){
          System.out.println("Run Time Exception");
      }

        System.out.println("==============================================");

      String str = "Cybertek";
      try {
          System.out.println(str.charAt(200));

      }catch (RuntimeException e){  // RunTimeException can handle any uncheck exception
          System.out.println(e.getMessage());
      }

        System.out.println("===================================================");

      try {
          Thread.sleep(3000);
      }catch (Exception e){

      }

        System.out.println("+===============================================");

        System.out.println("Completed");

        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }

        System.out.println("=====================================================");
        try {
            System.out.println(8 / 0); // Arithmetic exception
            System.out.println("Try Block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block");

        }finally {
            System.out.println("Finally block");
        }

    }


}
