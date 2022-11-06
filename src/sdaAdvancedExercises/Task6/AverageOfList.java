package sdaAdvancedExercises.Task6;

import java.util.ArrayList;
import java.util.List;

public class AverageOfList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(average(list));

    }

    public static Double average(List<Integer> list){
            return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
