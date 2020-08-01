package day35Array_List;

import java.util.ArrayList;

/*
Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

 */
public class ReversedOder {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
                    list.add(10);//0
                    list.add(20);//1
                     list.add(30);//2
                      list.add(40);//3
                      list.add(50);//4


        System.out.println(list.size());

        for(int i =  list.size()-1;i >=0 ; i--){
            System.out.print(list.get(i)+ " ");
        }



    }




}
