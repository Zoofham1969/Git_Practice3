package day42_Static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName = "Cybertek School";
    static  String favoriteTeacher = "Nadir";

    public  void setInfo(String name, int age, int groupNumber, char gender){
      this.name = name;
      this.age = age;
      this.groupNumber = groupNumber;
      this.gender = gender;


    }



    public String toString(){
        return "School name: "+schoolName+"\nStudent name: "+name;
          //                 static variable                instance variable
}


}
