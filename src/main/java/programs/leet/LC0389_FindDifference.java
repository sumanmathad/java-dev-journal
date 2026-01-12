package programs.leet;

public class LC0389_FindDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","pabcd"));
    }


    public static char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;

        for(int i=0; i<s.length();i++){
            sum1+=s.charAt(i);
        }
        for(int j=0; j<t.length();j++){
            sum2+=t.charAt(j);
        }
        return (char)(sum2-sum1);
    }
}
