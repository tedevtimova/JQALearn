package Homework2;

import java.util.stream.IntStream;

public class Task04 {
    public static void main(String[] args){
        int[] array = IntStream.rangeClosed(1,10).toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        int index = 0;
        while(index<array.length){
            System.out.println(array[index]);
            index++;
        }
        }
    }

