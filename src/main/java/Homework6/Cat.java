package Homework6;

public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Purr, purr, purr");
    }

    @Override
    void eat() {
        System.out.println("Would like some fish!");
    }

    @Override

    void play(){
        System.out.println("Show me a tree!");
    }
    void play(Cat a, int z) {
        System.out.println(a.name + " climbed on " + a.climb(z) + " trees today");
    }

  int climb (int x){

        if(x>0)
            return x;
        else
            return 0;
  }
}
