//Executing classs to use shape subclasses
public class ShapeArray {
    public static void main(String[] args) {
        //Instantiate triangle shape
        Shape triangle = new Triangle(3, 3, 3);
        //Instantiate circle shape
        Shape circle = new Circle(5);
        //Instantiate square shape (rectangle with equal sides)
        Shape square = new Rectangle(2, 2);

        //Store shapes in an array
        Shape[] shapeArray = { triangle, circle, square };

        //Loops through array and print area and perimeter data
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
