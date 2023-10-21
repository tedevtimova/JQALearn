package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    Computer(){

    }

    Computer(int year,double price,String operationSystem){
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    int comparePrices(Computer obj){

        if(price > obj.price)
            return -1;
        else if (price < obj.price)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
        Computer obj1 = new Computer();
        obj1.year = 2021;
        obj1.price = 2000;
        obj1.operationSystem = "Windows";

        Computer obj2 = new Computer(2022,2000.10,"Linux");
        System.out.println(obj1.comparePrices(obj2));
    }
}
