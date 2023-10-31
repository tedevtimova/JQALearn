package Homework6;

public class AnimalDemo {

    public static void main(String args[]){

        Dog dog = new Dog("Dog");

        dog.eat();
        dog.makeSomeNoise();
        dog.play();

        System.out.println();

        Cat cat = new Cat("Cat");

        cat.eat();
        cat.makeSomeNoise();
        cat.play();
        cat.play(5);

        System.out.println();

        Bird bird = new Bird("Bird");
        Bird bird2 = new Bird("Bird2");

        bird.eat();
        bird.makeSomeNoise();
        bird.play();
        bird.sync(bird2);
        bird.sync(bird,bird2);

    }

}
