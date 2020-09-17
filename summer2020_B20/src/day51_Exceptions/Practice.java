package day51_Exceptions;

import org.w3c.dom.ls.LSOutput;

class X{
   public X(){
       System.out.println("X");
   }
}


class Y extends X{
    public Y(){
        // super()
        System.out.println("Y");
    }
}


class Z extends Y{
    public Z(){
        System.out.println("Z");
    }
}


public class Practice {




}
