package patterns.structural.composit;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawin triangle with color: " + fillColor);

    }
}
