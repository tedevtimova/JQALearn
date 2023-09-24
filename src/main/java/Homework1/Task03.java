package Homework1;
import java.util.*;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1, num2 and num3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp = num2;
        int temp2 = num3;
        num3 = num1;
        num1 = temp;
        num2 = temp2;
        System.out.println("Value of num1 is now: " + num1);
        System.out.println("Value of num2 is now: " + num2);
        System.out.println("Value of num3 is now: " + num3);
        int sum = num1 + num2;
        int result = sum - num3;
        System.out.println("Sum of num1 and num2 is " + sum);
        System.out.println("Difference between the sum of num1 and num2 and num3 is " + result);
    }
}
