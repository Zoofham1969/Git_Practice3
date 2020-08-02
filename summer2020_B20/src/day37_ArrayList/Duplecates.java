package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplecates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 10 ,10 ));

        list.removeIf(p-> Collections.frequency(list, p)==1);
        System.out.println(list);
        System.out.println("===============================================================");
    ArrayList<String> names = new ArrayList<>();





    System.out.println("=========================================================");
    ArrayList<Integer> grades = new ArrayList<>();
    






    }


}
