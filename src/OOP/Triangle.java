package OOP;

public class Triangle {


    /*
    1. Create a new class Triangle
    2. Create three private fields each witch data type double and name them: side1,
    side2, side3.
    3. Create three setter methods for each side (e.g. public void setSide1 (double
            side1) { .......})
    4. Create three getter methods for each side that will return value of each side.
    5. Create private method named isValid that will accept three double data type
    arguments as input and return Boolean type value
    Create a public method named areaTriangle that return’s double type value of calculate area of triangle.
    Before starting to calculate area check if triangle is valid using our private method isValid.
    If response is true than start calculating area if not then print out “Triangle is not valid”
    and do not calculate area returning 0.**/

    //fields: Create three private fields each witch data type double and name them: side1, side2, side3.
    private double side1;
    private double side2;
    private double side3;


    //methods
    //setter methods: Create three setter methods for each side
    public void setSide1(double side1) {this.side1 = side1;}
    public void setSide2(double side2) {this.side2 = side2;}
    public void setSide3(double side3) {this.side3 = side3;}

    //getter methods: Create three getter methods for each side that will return value of each side

    public double getSide1() {return side1;}
    public double getSide2() {return side2;}
    public double getSide3() {return side3;}

    private boolean isValid(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double triangleArea(){
        double area;

        if(isValid(side1, side2, side3)){
            double halfPer = (side1 + side2 + side3)/2;
            area = Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));

        } else {
            System.out.println("Triangle is not valid");
            area = 0.0d;
        }

        return area;
    }


}
