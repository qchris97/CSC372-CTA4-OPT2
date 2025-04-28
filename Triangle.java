//triangle class that extends shape class
public class Triangle extends Shape {
    private double side1, side2, side3;

    //Parameterized constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Performs triangle area formula
    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //Performs triangle perimeter formula
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    //Returns formatted results from formula calculations
    @Override
    public String toString() {
        return String.format("Triangle: Area = %.2f, Perimeter = %.2f", area(), perimeter());
    }
}
