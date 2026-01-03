public class Main {
    public static void main(String[] args) {
Shape shape = new Shape();
Square square = new Square();
Circle circle = new Circle();
// even though the reference variable is Shape type it can access the Triangle methods
Shape shape1 = new Triangle();

// what variable it has access to depends on the reference variable
        shape.area();
        shape1.area();
        square.area();
        circle.area();
    }
}
