abstract class Alpha {
    public abstract void show();
    public abstract void demo();
}

abstract class Beta extends Alpha {
    @Override
    public void show() {
        IO.println("show method is overridden in Beta class");
     }
 }
 
class Gamma extends Beta {
     @Override
    public void demo() {
        IO.println("demo method is overridden in Gamma class");
     }
 }
 
public class AbstractDemo03 {
     public static void main(String[] args) {
        Gamma gamma = new Gamma();
        gamma.demo();
        gamma.show();
     }
 }