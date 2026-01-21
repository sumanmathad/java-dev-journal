package programs.tuf.Strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringII {

    List<Character> s =  Arrays.asList('h', 'e', 'l', 'l', 'o');

    @Test
    public void reverseString() {
        int len = s.size();
        char temp;
        for(int i=0;i<len/2;i++){
            temp=s.get(len-1-i);
            s.set(len-1-i,s.get(i));
            s.set(i,temp);
        }
        System.out.println(s);


    }



}
