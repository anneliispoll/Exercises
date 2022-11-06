package OOP.abstractions;

abstract class Animal{
    protected String name;
    public void sleep(){
        System.out.println("zzzzzz");
    }
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("oink oink");
    }
}



public class AbstractClassExample {
    public static void main(String[] args) {
        //cannot create an object from abstract class
        //Animal animal = new Animal();

        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
