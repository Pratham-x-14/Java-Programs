interface Animal {
    void sound();     // abstract method
    void eat();       // abstract method
}
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {

        Animal a = new Dog();   // Interface reference
        a.sound();
        a.eat();
    }
}
