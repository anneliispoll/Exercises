package OOP;

public class Bird {

    //Fields
   private String name;
   private String color;
   private double avgLifeSpan;


    //Methods
    //setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAvgLifeSpan(double avgLifeSpan) {
        this.avgLifeSpan = avgLifeSpan;
    }

    //getter methods

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getAvgLifeSpan() {
        return avgLifeSpan;
    }

    public void printBirdInfo(){
        System.out.println("Bird info:");
        System.out.println("Name - " + name);
        System.out.println("Color - " + color);
        System.out.println("Average lifespan - " + avgLifeSpan);
    }
}
