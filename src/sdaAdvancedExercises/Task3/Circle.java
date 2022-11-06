package sdaAdvancedExercises.Task3;

public class Circle extends Shape {
    private float radius;

    public Circle(String color, boolean isFilled, float radius){
        super(color, isFilled);
        this.radius = 1f;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea() {
        float area = (float) (Math.PI * radius * radius);
        return area;
    }

    public float getPerimeter() {
        float perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %f is a subclass of %s", radius, super.toString());
    }
}
