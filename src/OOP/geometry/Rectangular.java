package OOP.geometry;

public class Rectangular {
        protected float length;
        protected float width;

        public void area() { //method
            System.out.println("Area is: " + (length*width));

        }

        public void perimeter() { //method
            System.out.println("Width is: " + ((width*2)+(length*2)));
        }

    public Rectangular(float length, float width) { //constructor
            this.length = length;
            this.width = width;
    }
}
