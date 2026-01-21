package programs.tuf.Strings;

import org.junit.Test;

public class LargestOddNumInString {
    public static void main(String[] args) {
        String s = "00024682226882";
        System.out.println(largeOddNum(s));
    }


    public static String smallOddNum(String s) {
        Integer num = Integer.valueOf(s);
        do {
            if(!(num%2==0))
                return String.valueOf(num);
            num = num/10;
        }
        while (num!=0);

        return "";
    }


    public static String largeOddNum(String s){
        String result = s.replaceFirst("^0+","");
        int len = result.length();
        for(int i=len-1; i>=0;i--){
            int digit = result.charAt(i)-'0';
            if(digit%2!=0){
                return result.substring(0,i+1);
            }
        }
        return "";
    }

}
