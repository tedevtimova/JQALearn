package Homework1;

public class Task02 {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        double c = 20.50d;
        double d = 31.10d;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a is now: " + a);
        System.out.println("Value of b is now: " + b);
        double temp = c;
        c = d;
        d = temp;
        System.out.println("Value of c is now: " + c);
        System.out.println("Value of d is now: " + d);
        double castedA = a;
        System.out.println(a);
        System.out.println(castedA);
        int castedC = (int)c;
        System.out.println(c);
        System.out.println(castedC);
    }
}
