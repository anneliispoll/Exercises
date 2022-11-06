package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        User user1 = new User.UserBuilder("Anneliis", "Poll")
                .age(32)
                .phone("124598")
                .address("Kodu 123")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Antonio", "Banderas")
                .age(62)
                .phone("458965425")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Bob", "Test").build();
        System.out.println(user3);
    }
}
