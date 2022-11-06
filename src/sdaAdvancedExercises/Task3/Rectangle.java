package sdaAdvancedExercises.Task3;

public class Rectangle extends Shape {
    protected float width;
    protected float length;

    public Rectangle(){
        this.color = "unknown";
        this.isFilled = false;
        this.width = width;
        this.length = length;

    }

    public Rectangle(String color, boolean isFilled, float width, float length) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea(){
        return (float) (width * length);

    }
     public float getPerimeter(){
        return (float) ((2 * width) + (2 * length));
     }

    @Override
    public String toString() {
        return String.format("Rectangle with with = %f and length = %f is a subclass of %s", width, length, super.toString());
    }
}