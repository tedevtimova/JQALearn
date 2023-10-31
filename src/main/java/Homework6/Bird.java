package Homework6;

public class Bird extends Animal {

    Bird(String name){
        super(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Chirp, chirp, chirp");
    }

    @Override
    void play() {
        System.out.println("Jumping around");
    }

    @Override
    void eat() {
        System.out.println("Would like some bugs, please!");
    }

    void sync(Bird b){
       System.out.println("Just one bird singing.");
    }

    void sync(Bird b,Bird c)
    {
        System.out.println("Two birds singing, sound is getting louder!");
    }


}
