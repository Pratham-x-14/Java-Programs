abstract class Car {
    protected int speed;
    
    public Car() {
        speed = 120;
        IO.println("Car class constructor");
    }
    
    public void getCarDetails() {
        IO.println("Car has one engine 4 wheels");
    }
    
    public abstract void run();
}

class BMW extends Car {
    @Override
    public void run() {
        IO.println("BMW Car is running");
    }
}

public class AbstractDemo02{
    public static void main(String[] args) {
        Car car = new BMW();
        car.getCarDetails();
        car.run();
    }
}