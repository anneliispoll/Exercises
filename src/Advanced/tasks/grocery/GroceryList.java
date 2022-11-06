package Advanced.tasks.grocery;

//TODO:
// 1. addGroceryItem
// 2. printGroceryList
// 3. removeGroceryItem
// 4. modifyGroceryList

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GroceryList {

    //Field
    private ArrayList<String> groceryList = new ArrayList<>();


    //Methods
    public void addGroceryItem(String item) {
        if (checkIfValid(item)) {
            groceryList.add(item);
        } else {
            System.out.println("Item name is not valid");
        }
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println(item + " is deleted from the list");
        } else {
            System.out.println("Item is not in the list");
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        if (checkIfValid(newItem)) {
            if (position >= 0 && position < groceryList.size()) {
                System.out.println("Grocery list is updated " + groceryList.get(position) + " is changed");
                groceryList.set(position, newItem);
            } else {
                System.out.println("Item number is not valid");
            }
        } else {
            System.out.println("Item name is not valid");
        }
    }

    public boolean searchItem(String searchItem) {
        if (findItem(searchItem) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteAllItems() {
        groceryList.clear();
        System.out.println("All items in the list are deleted.");
        printGroceryList();

    }

    public void defaultGroceryItems() {
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Cheese");
        groceryList.add("Butter");
        groceryList.add("Chocolate");

        printGroceryList();
    }

    private boolean checkIfValid(String input){
        return Pattern.matches("[a-zA-Z ]+[0-9 ]*[a-zA-Z ]*", input);
    }
}
