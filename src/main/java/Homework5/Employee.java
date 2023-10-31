package Homework5;

public class Employee extends Person {

    double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
        double overtimePay = (daySalary / 8) * 1.5;
        if (age < 18)
            return 0;
        else
            return overtimePay * hours;

    }

    void showEmployeeInfo() {
        if (isMan)
            System.out.println("This is a man named " + name + ", who is " + age + " years old. His daily salary is " + daySalary);
        else
            System.out.println("This is a woman named " + name + ", who is " + age + " years old. Her1 daily salary is " + daySalary);
    }
}
