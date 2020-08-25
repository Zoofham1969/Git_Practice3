package officeHour_day2108_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
/*
Collections Utility:
		swap:
		sort:
		max:
		min:
		frequency:
 */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
                //                  0  1   2    3   4   5   6   7   8

        Collections.swap(list1,0, 1);

        System.out.println(list1);

        Collections.swap(list1,list1.size()-2,list1.size()-1);
        System.out.println(list1);



        Collections.max(list1);
        Collections.min(list1);
        Integer max = Collections.max(list1);
       Integer min = Collections.min(list1);

        System.out.println("Maximum number: " +max);
        System.out.println("minimum number: "+ min );
        System.out.println("===========================================================");


        String[] arr = {"Eggs", "Orange", "Milk", "Milk", "Toilet Paper","Toilet Paper","Toilet Paper","Toilet Paper", "Avocado"};

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count = Collections.frequency(items, "Toilet Paper" );
        System.out.println(count);


        //items.removeIf( I ->   Collections.frequency(items, I )  == 1      );  // removes the unique items
        items.removeIf( I ->   Collections.frequency(items, I )  != 1      );  // removes the non-unique items

        System.out.println(items);











    }

}
