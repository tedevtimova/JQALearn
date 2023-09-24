package Homework1;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours,sumMoney as double and weekday boolean as true or false");
        int hours = sc.nextInt();
        double sumMoney = sc.nextDouble();
        boolean weekday = sc.nextBoolean();

        if(weekday){
            if(sumMoney>=10){
                System.out.println("I will go to the movies");
            }else if(sumMoney<10 && sumMoney>0){
                System.out.println("I will go get icecream");
            }else{
                System.out.println("I will stay at home");
            }

        }else{
            System.out.println("I will go to work");
        }
    }
}