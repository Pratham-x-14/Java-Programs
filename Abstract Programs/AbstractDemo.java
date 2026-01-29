abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}