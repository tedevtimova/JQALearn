package Homework1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int num1 = input.nextInt();
        System.out.println("You entered " +num1);
        System.out.println("Enter next integer:");
        int num2 = input.nextInt();
        System.out.println("You entered " +num2);
        System.out.println("Enter next integer:");
        int num3 = input.nextInt();
        if(num3>num1 && num3<num2){
            System.out.println(num3 + " is between " +num1+ " and "+num2);
        }else if(num3<num1 && num3>num2){
            System.out.println(num3 + " is between " +num1+ " and "+num2);
        }else{
            System.out.println(num3 + " is not between " +num1+ " and "+num2);
        }
    }
}
