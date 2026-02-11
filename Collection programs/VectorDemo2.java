import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<Integer> listOfNumber = new Vector<>(100, 10);
        System.out.println("Initial capacity is : " + listOfNumber.capacity());

        for (int i = 0; i <= 99; i++) {
            listOfNumber.add(i);
        }

        System.out.println("Vector Capacity after adding 100 elements : " + listOfNumber.capacity());
        System.out.println("Vector size after adding 100 elements : " + listOfNumber.size());

        listOfNumber.add(999);

        System.out.println("Vector Capacity after adding 101 elements : " + listOfNumber.capacity());
        System.out.println("Vector size after adding 101 elements : " + listOfNumber.size());
    }
}
