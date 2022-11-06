package Advanced.tasks.grocery;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO:
// 1.delete all the items in the list (GroceryList.java)
// 2.Add 5 default items to the list when running program
// 3.Fix problem with option when entering not a number or number from choices (print: enter valid option)
// 4.check if the input contains only letters (regex) followed by any numbers


public class Main {

    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();



    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        addDefaultItems();
        printInstructions();


        while (!quit) {
            System.out.println("Enter your choice");

            try {
                choice = input.nextInt();
                    //bug fix
                input.nextLine();
                switch (choice) {
                        case 0:
                            //print all options
                            printInstructions();
                            break;
                        case 1:
                            //print grocery list
                            groceryList.printGroceryList();
                            break;
                        case 2:
                            //add item
                            addItem();
                            break;
                        case 3:
                            //modify list
                            modifyList();
                            break;
                        case 4:
                            //remove item
                            removeItem();
                            break;
                        case 5:
                            //search item
                            searchForItem();
                            break;
                        case 6:
                            //delete all items
                            deleteAll();
                            break;
                        case 7:
                            //quit
                            quit = true;
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Enter valid option! Integers only!");
                //bug fix
                input.nextLine();
                }
            }
        }
    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all items in the list");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(input.nextLine());
    }

    public static void modifyList() {
        System.out.println("Enter item number");
        int itemNo = input.nextInt();
        //fixing input bug
        input.nextLine();
        System.out.println("Enter replacement item");
        String newItem = input.nextLine();
        groceryList.modifyGroceryList(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name:");
        String itemName = input.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for");
        String searchItem = input.nextLine();
        if (groceryList.searchItem(searchItem)) {
            System.out.println("Found " + searchItem + " in your shopping list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void deleteAll() {
        groceryList.deleteAllItems();
    }
    public static void addDefaultItems() {
        System.out.println("These items are already added to you list by default");
        groceryList.defaultGroceryItems();
    }
}


