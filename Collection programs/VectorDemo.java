import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pomogranate");
        fruits.add("Apple");
        fruits.add("Papaya");
        fruits.add("Pear");

        System.out.println("Printing the Data :");
        fruits.forEach(System.out::println);

        System.out.println("Removing based on the index :");
        fruits.remove(2);
        fruits.forEach(System.out::println);

        System.out.println("Removing based on the Object :");
        fruits.remove("Orange");
        fruits.forEach(System.out::println);

        System.out.println("Sorting the Object using Utility class :");
        Collections.sort(fruits);
        fruits.forEach(System.out::println);
    }
}

