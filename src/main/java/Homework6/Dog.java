package Homework6;

public class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bark, bark, bark!");
    }

    @Override
    void play() {
        System.out.println("Throw me a stick!");
        bringStick();
    }

    @Override
    void eat() {
        System.out.println("Give me a juicy bone!");

    }

    void bringStick(){
        System.out.println("I brought the stick!");
    }
}
