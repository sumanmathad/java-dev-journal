package dev.arrays;

public class Basics {

    public static void main(String [] args){

        int[] numbers = new int[5]; // Creates an empty array for 5 integers
        String[] fruits ={"Mango","grapes","jack fruit"};
        System.out.println(fruits[0]);
        System.out.println(fruits.length);

        for(int i=0;i<fruits.length;i++){
            System.out.println("Index "+i+" contains "+fruits[i]);
        }

        for(String fruit:fruits){
            System.out.println(fruit);
        }


    }




}
