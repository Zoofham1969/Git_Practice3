package officeHour_day21_o8_24_2020ArrayList_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_recap {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(list);

    for (Integer each:list){
        System.out.println(each);

        System.out.println("========================================");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30, 40, 50, 60,  70, 80, 90, 100, 200));

    list2.removeAll(Arrays.asList(40, 50 ,90, 200));

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);

        System.out.println(list2.get(0));

        System.out.println(list2.get(list2.size()-1));

        list2.set(0, 300);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);


        System.out.println("======================================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Ahmed", "Elkem", "Cristina", "Amton", "Ahmed", "Ahmed")  );

        names.removeIf(p -> p.equals("Ahmed"));
        System.out.println(names);






    }



    }






}
