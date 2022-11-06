package sdaAdvancedExercises.Task5;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        int arraySize, i, j, temp;
        System.out.println("How many numbers do you want to enter?:");
        Scanner input = new Scanner(System.in);
        arraySize = input.nextInt();

        int storeArray[] = new int[arraySize];

        System.out.println("Enter desired amount of numbers one by one");
        for (i = 0; i < arraySize; i++) {
            System.out.println("Enter element number: " + (i + 1));
            storeArray[i] = input.nextInt();
        }

            for (i = 0; i < arraySize - 1; i++)
                for (j = 0; j < arraySize - i - 1; j++)
                    if (storeArray[j] > storeArray[j + 1]) {
                        //swap storeArray[j+1] and storeArray[j]
                        temp = storeArray[j];
                        storeArray[j] = storeArray[j + 1];
                        storeArray[j + 1] = temp;
                    }
        System.out.println("Numbers in ascending order: ");
        for (i = 0; i < arraySize; ++i) {
            System.out.println(storeArray[i] + " ");
        }
    }
}


