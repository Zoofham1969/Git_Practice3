package day47Encapsulations_I_Q;

import java.time.LocalDate;

public class Person {

    public  String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }
}
