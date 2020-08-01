package day20_WhileLoops;

public class Branching_Statement {
    public static void main(String[] args) {
//while loop
        char ch = 'A';

        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue; // skips everything even the iterator

            }

            System.out.println(ch);

            ch++;
        }










    }


}
