package dev.variables_datatypes;

import org.junit.Test;

public class wrappers {

    @Test
    public void integerWrapper(){

        System.out.println(Integer.reverse(5));



    }

    String s="01234";

    @Test
    public void stringIntegerConversions(){
        System.out.println(Integer.parseInt(s));     // 1234
        System.out.println(Integer.valueOf(s));      // 1234
    }




}
