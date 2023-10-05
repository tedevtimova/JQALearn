package Homework2;

public class Task05 {

    public static void main(String[] args){

    int [] array = new int []{10,12,1,8,4};
    int [] arraySecond = array.clone();

        System.out.println("Values in the original array are:");

    for(int i:array){
        System.out.println(i);
    }

    System.out.println();

        System.out.println("Values in the copied array are:");

    for(int x:arraySecond){
        System.out.println(x);
    }
}
}
