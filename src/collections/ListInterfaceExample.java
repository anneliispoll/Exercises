package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //declaring ArrayList
        ArrayList<String> car = new ArrayList<>();

        //add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //print out all elements
        System.out.println(car);

        //print out element by index
        System.out.println(car.get(0));

        //add element at specific index
        car.add(2, "Ford");
        System.out.println(car);

        //change element values
        car.set(3, "Toyota");
        System.out.println(car);

        //remove element
        car.remove(5);
        System.out.println(car);

        //size
        System.out.println(car.size());

    }
}
