package Advanced;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[4]);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        System.out.println("Hello world");

        try {
            int num1 = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("There was problem with some math operations");
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block"); //will always executed
        }
    }
}
