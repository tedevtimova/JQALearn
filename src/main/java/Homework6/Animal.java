package Homework6;

public abstract class Animal implements IAnimal{

    String name;

    Animal(String name){
        this.name = name;
        System.out.println("Hi! I am an animal called " + this.name);
    }

    abstract void play();
    abstract void eat();

}

