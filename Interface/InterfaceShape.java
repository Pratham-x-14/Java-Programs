interface Shape {

    // abstract methods
    double area();
    double perimeter();

    // default method
    default void display() {
        System.out.println("This is a shape");
    }
}
class Rectangle implements Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}
public class InterfaceShape {

    public static void main(String[] args) {

        Shape shape = new Rectangle(10, 5);

        shape.display();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}