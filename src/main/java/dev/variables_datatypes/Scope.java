package dev.variables_datatypes;

import org.junit.Test;

public class Scope {


    @Test
    public void verifyForLoop(){

        for (int j=0;j<10;j++)
            System.out.println("value of j is "+j);
        // System.out.println("value of j is "+j);   //throws error as j scope is in for loop only

    }




}
