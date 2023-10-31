package Homework5;

public class Student extends Person {

    double score;

    Student(String name,int age,boolean isMan,double score){
        super(name,age,isMan);
        if(score < 2 || score > 6)
            System.out.println("Invalid score entered!");
       else
           this.score = score;

    }

    void showStudentInfo(){
        if (isMan)
            System.out.println("This is a man named " + name + ", who is " + age + " years old. His score is " + score);
        else
            System.out.println("This is a woman named " + name + ", who is " + age + " years old. Her score is " + score);

    }
}
