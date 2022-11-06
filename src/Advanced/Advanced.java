package Advanced;

import java.util.Scanner;

public class Advanced {

    public static String loop10times() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
        return null;
    }

    public static int reverseNumbers() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        //5-> 5, 4, 3, 2, 1
        int input = scanner.nextInt();

        for (int i = input; i > 0; i--) {
            System.out.print(i + " ");
        }

        return input;
    }


    public static int reverseNumbers2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int input = scanner.nextInt();

        if (input >= 0) {
            for (int i = input; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = input; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }


        return input;
    }

    public static String whileLoopExample() {

        int i = 0;
        while (i < 10) {
            System.out.println("Hello world!");
            i++;
        }
        return null;
    }

    public static char whileLoopExample2() {


        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        while (runAgain == 'y') {

            System.out.println("Please enter any number: ");
            int input = scanner.nextInt();
           //negative scenario
            if(input < 0){
                for (int i = 0; i >= input; i--){
                    System.out.print(i + " ");
                }
            } else {
                for (int i = 0; i <= input; i++){
                    System.out.print(i + " ");
                }

            }
            System.out.println();

            System.out.println("Do you want to run again? (y/n)");
            runAgain = scanner.next().charAt(0);
        }

        return runAgain;
    }

    public static String[] arrayExample(){

        //declare array that will store 3 elements of type String
        String[] names = new String[3];

        //setting element value using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //getting values from array
        System.out.println(names[2]);

        //length
        System.out.println(names.length);

        //second way declare and initialize array
        String[] dreamCars = new String[]{"BMW", "Tesla", "Daewoo", "Ferrari"};

        //iterate through all elements in an array for loop
        for (int i = 0; i < dreamCars.length; i++){
            System.out.println(dreamCars[i]);

        }

        //same thing but using for-each loop.
        for (String car: dreamCars){ //first is local variable created; array list
            System.out.println(car);
        }

        return names;
    }
}
