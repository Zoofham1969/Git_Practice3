package day53_FinalKeyword;

public class BreakTimeException extends RuntimeException {
public BreakTimeException(){
    super("It's time for a break");
    System.out.println("Time to take 15 min break ");
}
}
   class Test{


    public static void main(String[] args) {

    throw new BreakTimeException();

    }

    }





