package Homework3;

public class CarTwo {
    public int year;
    public float price;
    public boolean isSportsCar;
    public int fuelTankCapacity;
    public double freeFuel;
    public String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {

        engineFuelOperationSystem = newEngineFuelOperationSystem;

    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel)
            System.out.println("Not enough fuel!");
        else
            freeFuel = freeFuel - fuel;
    }

    public CarTwo(int year, float price, int fuelTankCapacity, double freeFuel,
                  String engineFuelOperationSystem,boolean isSportsCar) {
        this.year = year;
        this.price = price;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
        this.isSportsCar = isSportsCar;

    }
}

class CarPerson2 {

    public static void main(String[] args) {
        CarTwo renault = new CarTwo(2023, 200000, 100, 66.55, "gasoline", true);

        renault.useFuel(71.55);

        CarTwo ford = new CarTwo(2000, 20000, 90, 55, "diesel", false);

        ford.changeEngineFuelOperationSystem("gasoline");

        System.out.println("Renault car properties: year " + renault.year +", price "+renault.price + ", fuel tank capacity " +
                renault.fuelTankCapacity + ", free fuel " +renault.freeFuel + ", EOS " + renault.engineFuelOperationSystem + ", sports car " +renault.isSportsCar);
        System.out.println("Ford car properties: year " + ford.year +", price "+ford.price + ", fuel tank capacity " +
                ford.fuelTankCapacity + ", free fuel " +ford.freeFuel + ", EOS " + ford.engineFuelOperationSystem + ", sports car " +ford.isSportsCar);

    }
}

