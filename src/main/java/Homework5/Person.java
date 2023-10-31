package Homework5;

public class Person {
    String name;
    int age;
    boolean isMan;

    Person(String name,int age,boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    void showPersonInfo(){
        if (isMan)
        System.out.println("This is a man named " + name + ", who is " + age + " years old.");
        else
            System.out.println("This is a woman named " + name + ", who is " + age + " years old.");

    }

}
