package dev.strings;

public class StringBuilders {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int length1=word1.length();
        int length2=word2.length();
        StringBuilder result = new StringBuilder();
        for (int i=0;i<length1 || i<length2;i++){

            if(i<length1){
                result.append(word1.charAt(i));
            }
            if(i<length2){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }


}
