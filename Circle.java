//Circle shape that extends shape class
public class Circle extends Shape {
    private double radius;

    //Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Performs circle area formula
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    //Performs circle perimeter formula
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //Returns formatted results from formula calculations
    @Override
    public String toString() {
        return String.format("Circle: Area = %.2f, Perimeter = %.2f", area(), perimeter());
    }
}
