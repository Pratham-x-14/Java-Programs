interface Calculator {

    // abstract methods (by default public & abstract)
    int add(int a, int b);
    int subtract(int a, int b);
}
class BasicCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class InterfaceCalculatorDemo {

    public static void main(String[] args) {

        Calculator calc = new BasicCalculator(); // interface reference

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
