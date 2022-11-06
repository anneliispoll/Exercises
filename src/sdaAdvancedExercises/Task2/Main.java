package sdaAdvancedExercises.Task2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sally", "Home 123");
        System.out.println(person1.toString());

        Student student1 = new Student("Barbara", "Home 345", "Full-time", 3, 3500);
        System.out.println(student1.toString());

        Lecturer lecturer1 = new Lecturer("Bob", "Home 789", "Biology", 2000);
        System.out.println(lecturer1.toString());


    }
}
