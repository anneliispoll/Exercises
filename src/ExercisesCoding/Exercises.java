package ExercisesCoding;

import java.util.Scanner;

public class Exercises {


    private static Scanner scanner = new Scanner(System.in);

    public static int[] getArrayDataForUser() {
        System.out.print("How many numbers do you want to enter?:");
        int numOfnums = scanner.nextInt();

        int[] numbers = new int[numOfnums];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int getMinNumberInArray() {
        int[] numbers = getArrayDataForUser();

        for (int i = 0; i < numbers.length; i++) {
        }

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber)
                minNumber = numbers[i];
        }
        return minNumber;
    }


    public static int getSmallest() {
        int[] userNumbers = getArrayDataForUser(); //retrieve data from the user

        int smallest = userNumbers[0]; //initialize it to the first element
        for (int i = 0; i < userNumbers.length; i++) {
            if (smallest > userNumbers[i]) { //if the current value is bigger than our current value
                smallest = userNumbers[i];
            }
        }
        return smallest;
    }

    // Create a method to count the number of vowels in a string and returns that number


    public static int getVowelCount() {
        String userInput = scanner.nextLine();

        int vowelCount = 0;

        char[] userStringArray = userInput.toLowerCase().toCharArray(); //convert the letters to lower case first
        //before you break into an array.

        for (int i = 0; i < userStringArray.length; i++) {
            char currentChar = userStringArray[i];

            //Check if the current char is a vowel, if so increment the vowel counter
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }


    // that accepts a series of a string from the user and returns it as a string array
// returns the average length from an array of strings passed into it
    /*public static String[] getStringToArray() {
        String userInput1 = scanner.nextLine();
        char[] charArray = userInput1.toCharArray();
        for (int i = 0; i < userInput1.toCharArray().length; i++)
        return charArray;


    }
}
*/
// method overloading is a way to write multiple methods to do the same or
// similar to the using the same name but a different method signature

/*public static float getAverageLength() {
String[] words = get}
}*/

// write a method to search through a series of strings entered by the user and return true
// or a similar output if the string pancake is found in the array

    /*public static String[] getStringArrayDataFromUser() {
        System.out.print("How many strings do you want to enter?: ");
        int numOfNums = scanner.nextInt(); //

        String[] words = new String[numOfNums]; // Use the number to create an array

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter a string: ");
            words[i] = scanner.next();
        }

        return words;
    }

    public static boolean findPancake() {
        String[] wordsArray = getStringArrayDataFromUser();

        String myStr = "Pancake";

        for (int i = 0; i < wordsArray.length; i++) ;
        {
            if (wordsArray[].equalsIgnoreCase(myStr)) {
                return true;
            }
            return false;
        }
    }
}
*/


//write a method to return percentage of odd numbers present in a dataset entered by the user.

    public static float getPercentageOdd() {
        int[] numbers = getArrayDataForUser();

        float oddCount = 0; //
        for (int number : numbers) {
            if (number % 2 != 0) { //check for odd numbers
                oddCount++; //increase odd count by 1
            }
        } //(value / total) * 100 -> percentage
        float percent = (oddCount / numbers.length) * 100;

        return percent;
    }

    public static boolean checkSquareRoot() {
        System.out.println("Enter first number:");
        int x = scanner.nextInt();
        System.out.println("Enter second number and check if it's a square root of the first number:");
        int y = scanner.nextInt();

        if (y / x == x) {
            return true;
        }
        return false;
    }


    //write a method that takes the length and width of a rectangle from the user and finds the perimeter
    public static int rectanglePerimeter() {
        System.out.print("Enter rectangle length: "); //asks users 1-st input
        int x = scanner.nextInt(); //takes users 1-st input
        System.out.print("Enter rectangle width: "); //asks users 2-nd input
        int y = scanner.nextInt(); //takes users 2-nd input

        int perimeter = 2 * (x + y); // calculates rectangle perimeter based on user inputs
        return perimeter; // returns the value of rectangle perimeter
    }


//Write a program that takes a word from the user and returns it's reverse.

    //Take user input
    public static String printWordReverse() {
        System.out.print("Enter your word: ");
        String word = scanner.nextLine();

        //returns user word in reverse

        String reverseWord = new StringBuilder(word).reverse().toString();
        return reverseWord;
    }


// Write a method to return 3rd smallest number from set of 5 numbers entered by the user

    //ask user to enter 5 numbers
    //store 5 numbers in an array
    //check which is the 3rd smallest number
    //print out 3rd smallest number

    public static int thirdSmallestNumber() {
        //ask user to enter 5 number

        int[] array = new int[5]; //user will enter 5 numbers which we need to keep in an array
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();  //read array elements from user
        }
        // sort the array

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[2];
    }


//write  a method to find an area of the circle with the radius received from a user

    //ask user to enter the radius of a circle
    //get the area of the circle
    //return area of the circle
    public static double areaOfTheCircle() {
        System.out.print("Enter radius of the circle: ");
        int radius = scanner.nextInt();

        double circleArea = Math.PI * (Math.pow(radius, 2));

        return circleArea;
    }


//write a method that takes a set of 3 numbers from the user and returns true if the addition of all
// three numbers is less than 100, else it returns false

    //ask user input for three times
    //find sum of those three numbers
    //if less than 100 -> return true
    //if greater than 100 -> return false

    public static boolean sumOfThreeNumbers() {
        //take user input
        int[] array = new int[3];
        System.out.println("Enter 3 numbers");
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
        //find sum of those three numbers
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        //compare the sum with 100
        if (sum < 100) {
            return true;
        }
        return false;
    }


//Write a method to find a square and square root of a sum of 4 numbers entered
// by the user and the difference between the square and the square root

    //ask user the input for 4 times
    //find sum of those 4 numbers
    //find square of the sum
    //find square root of the sum
    //find the difference between the square and square root

    public static double squareAndSquareRoot() {
        //take user input
        int[] array = new int[4];
        System.out.println("Enter 4 numbers");
        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextInt();
        }
        //find sum of those four numbers
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum of four numbers is:" + sum);

        //find square of the sum
        double square = Math.pow(sum, 2);
        {
            System.out.println("The square is: " + square);
        }

        //find square root of the sum
        double squareRoot = Math.pow(sum, 0.5);
        {
            System.out.println("The square root is: " + squareRoot);
        }
        //find the difference between the square and square root

        double differenceBetween = (square - squareRoot);

        return differenceBetween;
    }


//Write a method that takes the string from the user and returns true when it is checked that the string
// entered by the user reads the same forwards and backwards in other words it is a PALINDROME.
// NB! Your method should not be case-sensitive
//mama - amam -> false
//madam - madam -> true

    //take string input from user
    //reverse the string
    //check if reverse string equals to the original input
    //if yes - ture
    //if not - false

    public static boolean palindrome() {

        // take user input
        System.out.print("Enter your word: ");
        String word = scanner.next();

        //changes user word to reverse
        String reverseWord = new StringBuilder(word).reverse().toString();
        {
            System.out.println("Word in reverse: " + reverseWord);
        }

        //checks if reverse string equals to the original input
        boolean compareWords = word.equalsIgnoreCase(reverseWord);
        {
            return compareWords;
        }
    }


//Write a method that accepts a year from the user and returns a
// result informing the user if the year is a leap year or not
//A leap year is exactly divisible by 4 except for century years (years ending with 00).
// The century year is a leap year only if it is perfectly divisible by 400.

    //Take the user input
    //check if it is divisible by 4
    //if yes, it's a leap year
    //if not, it's not a leap year
    //check if it is divisible by 400
    //if yes, it's a leap year
    //check if is divisible by 100
    //if not it's not leap year
    //if yes, it's a leap year

    public static boolean leapYear() {

        // take user input
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        //if the year is not divisible by 4, it's not a leap year
        if (year % 4 != 0) {
            return false;
            //but if it's divisible by 4 and if it's divisible by 400, it's a leap year
        } else if (year % 400 == 0) {
            return true;
            //if it's divisible by 4 and 400, but if it's not divisible by 100, it's not a leap year
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}




















