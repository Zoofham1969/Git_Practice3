package day25_Practices;

public class longest_String_for_eachLoop {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abuduljabar", "mamattursun"
                , "Gebremariam","MahfoozParwani"};

        int maxLength = arr[0].length();

        for( String each : arr){
                if( each.length() > maxLength ){
                    maxLength = each.length();
                }
            }

            System.out.println(maxLength);

            for(String each: arr){
                if(each.length() == maxLength){
                    System.out.println(each);
                }
            }







        }
}