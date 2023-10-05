package Homework2;

public class Task02 {
    public static double GetAverage(double a,double b){
        double sum = a+b;
        double average = sum/2;
        return average;

    }

    public static void main (String[] args){
        double x = 10.00;
        double y = 11.00;
        System.out.println("The average of the two numbers is " + GetAverage(x,y));
    }
}
