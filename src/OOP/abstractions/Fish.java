package OOP.abstractions;

public class Fish extends Pet{
    private int waterChangesInWeek;

    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Age: " + age);
        System.out.println("Fish water change in week: " + waterChangesInWeek);
    }

    public Fish(String color, String eat, String place, int age, int waterChangesInWeek){
        super(color, eat, place, age);
        this.waterChangesInWeek = waterChangesInWeek;
    }

}
