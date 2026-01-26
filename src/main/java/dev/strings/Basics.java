package dev.strings;

import org.junit.Test;

public class Basics {


    String s= "Test";
@Test
    public void stringvalidations(){
    System.out.println(s.charAt(0));
    System.out.println(s.length());
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s.codePointAt(0));
    System.out.println(s.indexOf('T'));
    System.out.println(s.isBlank());
    System.out.println(s.isEmpty());
    System.out.println(s.substring(1));


}

}

