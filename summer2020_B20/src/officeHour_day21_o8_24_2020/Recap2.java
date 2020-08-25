package officeHour_day21_o8_24_2020;

import java.util.Arrays;

public class Recap2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8};

        for (int each : nums) {
            if (each % 3 != 0) {
                continue;
            }
            System.out.println(each);

        }

        System.out.println("======================================");

        String[] names = {"Mawlan", "Memetjan", "Nicolas", "Elkem", "Aysen"};

        for (String each : names) {
            if (each.toLowerCase().contains("m")) {
                System.out.println(each);
            }


        }
        System.out.println("========================================================");

    int [] arr1 = {89, 79, 400, -100, -200, 59};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

    String[] student = {"Mawlan", "Memetjan", "Nicolas", "Elkem", "Aysen"};


        System.out.println(Arrays.toString(student));

        System.out.println("========================================================");

        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};

        System.out.println(Arrays.equals(a1,a2));
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));
    }

    }

