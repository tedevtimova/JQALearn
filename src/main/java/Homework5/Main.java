package Homework5;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Teddy", 41, false);
        Person p2 = new Person("Ivo", 42, true);
        Person p3 = new Employee("Jenny", 25, false, 320);
        Person p4 = new Employee("John", 34, true, 280);
        Person p5 = new Student("Arya", 15, false, 4.56);
        Person p6 = new Student("Sansa", 18, false, 5);

        Person[] people = new Person[10];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;
        people[3] = p4;
        people[4] = p5;
        people[5] = p6;

        for (Person p : people) {
            if (p instanceof Employee)
                ((Employee) p).showEmployeeInfo();
            else if (p instanceof Student)
                ((Student) p).showStudentInfo();
            else if (p != null)
                p.showPersonInfo();

        }

        for (Person p : people) {
            if (p instanceof Employee)
                System.out.println(((Employee) p).calculateOvertime(2));

        }
    }
}
