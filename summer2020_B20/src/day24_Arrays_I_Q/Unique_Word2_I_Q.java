package day24_Arrays_I_Q;

public class Unique_Word2_I_Q {

    public static void main(String[] args) {
    // easy way to find unique word
    //  =============================
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++", "Ruby"};

        for(String each: words){
            int count = 0;
            for( String b  : words  ){ // b represents each elemnts in the array
                if(each.equals(b)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }

        }







    }

        }













