package officeHour_day21.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {

        String[] a1 = {"Tetiana", "Hamit", "Phornsri"};
        String[] a2 = {"Aaloa", "Zaki", "Cristina", "Daut"};

        String[] students = new String[a1.length + a2.length]; //[Tetiana, Hamit, Phornsri, null, null, null, null]
        //       3    4     5     6
        for (int i = 0; i <= a1.length - 1; i++) {
            students[i] = a1[i];
        }

        for (int j = 0; j <= a2.length - 1; j++) {
            students[j + a1.length] = a2[j];
        }

        System.out.println(Arrays.toString(students));


    }





}
