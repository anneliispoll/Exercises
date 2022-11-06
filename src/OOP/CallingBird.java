package OOP;

public class CallingBird {
    public static void main(String[] args) {

       Bird bird1 = new Bird();
       //set fields values
       // bird1.name = "Owl";
       // bird1.color = "White";
      //  bird1.avgLifeSpan = 15.7d;

        //get field values
      //  System.out.println(bird1.name);
      //  System.out.println(bird1.color);
      //  System.out.println(bird1.avgLifeSpan);

        //get bird info using printBirdInfo method

        //setting field values using setter methods
        bird1.setName("Parrot");
        bird1.setColor("Green");
        bird1.setAvgLifeSpan(70);

        //getting values using getter methods
        System.out.println(bird1.getName());
        System.out.println(bird1.getColor());
        System.out.println(bird1.getAvgLifeSpan() );


        bird1.printBirdInfo();
    }
}
