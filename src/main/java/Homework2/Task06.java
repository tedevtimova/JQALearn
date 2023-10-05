package Homework2;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};

        if (Arrays.equals(arrayOne, arrayTwo))
            System.out.println("Arrays are the same.");
        else
            System.out.println("Arrays are not the same.");
    }
}

