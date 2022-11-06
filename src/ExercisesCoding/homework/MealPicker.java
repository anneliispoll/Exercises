package ExercisesCoding.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MealPicker {
    public static void main(String[] args) {

        //arraylists
        ArrayList<String> breakfast = new ArrayList<>();
        breakfast.add("Porridge with peanut butter and jam");
        breakfast.add("Porridge with parmesan and butter");
        breakfast.add("Scrambled eggs with ham");
        breakfast.add("Sandwiches");
        breakfast.add("Pancakes");

        ArrayList<String> lunch = new ArrayList<>();
        lunch.add("Caesar salad");
        lunch.add("Chicken pasta with blue cheese");
        lunch.add("Dumplings");
        lunch.add("Chilli con carne");
        lunch.add("Lasagne");

        ArrayList<String> dinner = new ArrayList<>();
        dinner.add("Pumpkin soup");
        dinner.add("Tacos");
        dinner.add("Mac and cheese");
        dinner.add("Chicken curry");
        dinner.add("Tom kha soup");

        // scanner asking for user input
        System.out.println("What would you like to eat today? Please choose your meal type: breakfast/lunch/dinner");
        Scanner scanner = new Scanner(System.in);
        String mealType = scanner.nextLine().toLowerCase().trim();

        // random generator
        Random random = new Random();
        int index = random.nextInt(breakfast.size());


        //switch meal types according to user input
        switch (mealType) {
            case "breakfast":
                System.out.println("For breakfast, you should eat " + breakfast.get(index));
                break;
            case "lunch":
                System.out.println("For lunch, you should eat " + lunch.get(index));
                break;
            case "dinner":
                System.out.println("For dinner, you should eat " + dinner.get(index));
                break;
            default:
                System.out.println("Oops! Something went wrong! Please choose your meal type again");

        }
    }
}