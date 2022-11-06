package sdaAdvancedExercises.Task3;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("blue", true);
        System.out.println(shape.toString());

        Square square = new Square("red", true, 2);
        System.out.println(square);
    }
}
