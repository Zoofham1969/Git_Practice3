package officeHour_day21.practice07_15_20;

public class FrequencyOfWord_I_Q {

    public static void main(String[] args) {

        String str = "cat cat cat cat cat cat " ;

        int count = 0 ;
        while(str.contains("cat")){
            count++ ;
        str = str.replaceFirst("cat"  , "");
        }

        System.out.println(count);
/*
 String str = "dog dog dog cat cat cat cat cat cat Dog Dog Dog";
        str = str.toLowerCase();

        int countOfDog = 0; // 1+1+1

        while(str.contains("dog")){//: true true true false
            str = str.replaceFirst("dog", "");
                    //"dog dog"
                    //"dog"
                    //""
            countOfDog++;
        }

        int countOfCat = 0;

        while(str.contains("cat")){
            str = str.replaceFirst("cat", "");
            countOfCat++;
        }



        System.out.println("Dog: "+countOfDog);
        System.out.println("Cat: "+countOfCat);

        System.out.println(countOfDog);
        System.out.println(str);
        System.out.println( countOfCat == countOfDog );


 */




    }


}
