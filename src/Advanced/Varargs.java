package Advanced;

public class Varargs {
    public static void main(String[] args) {

            printNumbers(2,1,8,6,7,4,62);
            printNumbers(4);
            printArgs(15,5,4,3,5,4,2);
            printFriends("Felix",13, "Bob","Joshua","John","Pedro", "Amanda");
    }

    public static void printNumbers(int...numbers){
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArgs(int age, int... grades){
        System.out.printf("Your age is %d\n", age);
        System.out.print("Your grades: ");
        for (int num : grades) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printFriends(String yourName, int yourAge, String... friends){
        String bestFriend = "";
        System.out.printf("Your name is %s and you are %d years old. \n", yourName, yourAge );

        System.out.print("Your friends are: ");
        for(String name: friends){
            if(name.length() > bestFriend.length()){
                bestFriend = name;

            }
            System.out.print(name + ", ");
        }
        System.out.println();

        System.out.printf("Your best friend is %s", bestFriend);
    }

}
