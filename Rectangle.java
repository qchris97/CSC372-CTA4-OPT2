//Rectangle shape extending the shape class
public class Rectangle extends Shape {
    //Dimensions of rectangle
    protected double width;
    protected double length;

    //Parameterized constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Performs area formula
    @Override
    public double area() {
        return width * length;
    }

    //Performs perimeter formula
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    //Returns formatted results from formula calculations
    @Override
    public String toString() {
        return String.format("Rectangle: Area = %.2f, Perimeter = %.2f", area(), perimeter());
    }
}
