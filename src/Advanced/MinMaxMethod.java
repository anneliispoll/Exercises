package Advanced;

import java.util.Arrays;

public class MinMaxMethod {
    public static void main(String[] args) {
        int[] my_array = {10, 85, 64, 75, 945, 321, 45, 1, 6, 46};
        int[] randomArray = {45, 12, 65, 84, 93, 758, 600, 1235, 49};
        String [] strangeArray = {"%", "##", "€€€" };

        System.out.println(strangeArray[2]);

        System.out.println(Arrays.toString(my_array));
        System.out.println(my_array[3]);

        System.out.println(max(my_array));
        System.out.println(max(randomArray));
        System.out.println(min(my_array));
        System.out.println(min(randomArray));
    }

    //Max
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Min
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
