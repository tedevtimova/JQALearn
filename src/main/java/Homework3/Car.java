package Homework3;

public class Car {

    public int year;
    public float price;
    public boolean isSportsCar;
    public int fuelTankCapacity;
    public double freeFuel;
    public String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem){

    engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel){
        if(fuel>freeFuel)
            System.out.println("Not enough fuel!");
       else
            freeFuel = freeFuel - fuel;
    }
}

class CarPerson{

    public static void main(String [] args){
        Car renault = new Car();
        renault.year = 2023;
        renault.price = 200000;
        renault.fuelTankCapacity = 100;
        renault.freeFuel = 66.55d;
        renault.engineFuelOperationSystem = "gasoline";
        renault.isSportsCar = true;

        renault.useFuel(31.55);

        Car ford = new Car();
        ford.year = 2000;
        ford.price = 20000;
        ford.fuelTankCapacity = 90;
        ford.freeFuel = 55d;
        ford.engineFuelOperationSystem = "diesel";
        ford.isSportsCar = false;

        ford.changeEngineFuelOperationSystem("gasoline");

        System.out.println("Renault car properties: year " + renault.year +", price "+renault.price + ", fuel tank capacity " +
                renault.fuelTankCapacity + ", free fuel " +renault.freeFuel + ", EOS " + renault.engineFuelOperationSystem + ", sports car " +renault.isSportsCar);
        System.out.println("Ford car properties: year " + ford.year +", price "+ford.price + ", fuel tank capacity " +
                ford.fuelTankCapacity + ", free fuel " +ford.freeFuel + ", EOS " + ford.engineFuelOperationSystem + ", sports car " +ford.isSportsCar);


    }
}
