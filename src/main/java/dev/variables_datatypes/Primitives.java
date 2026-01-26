package dev.variables_datatypes;

import org.junit.Test;

public class Primitives {

    final int ONE= 1;   //compile-time constants.
    final int TWO= 2;   //compile-time constants.
    final long THREE =3;
    byte sum = ONE+TWO;     //Since 3 fits in byte, it allows the assignment without an explicit cast. This is called Constant Variable Narrowing.
    // byte sumlong = ONE +THREE;   //error as constant variable narrowing only applies to int and not long

    final int a= 100;   //compile-time constants.

    final int b= 200;   //compile-time constants.
   // byte c= a+b;        //compile-time error because the compiler sees it won't fit.
    byte d = (byte) (a+b);  //tells the compiler to perform the overflow math  and results in 44.   byte range is 256. so (number-256)

@Test
    public void validations(){
//    System.out.println(c);
    System.out.println(d);
}

@Test
    public void checkAssignments(){
    byte a = 1;
    byte b =2;
    //byte c= a+b; // compile error
    byte c= (byte) (a+b);    //to be casted
}

@Test
    public void formatsConversions(){

    int x =022 + 1;
    int y= 07+1;
    System.out.println(x);
    System.out.println(y);
    System.out.println(Integer.toOctalString(x));

    int l =010 + 04;
    System.out.println(l);

}






}
