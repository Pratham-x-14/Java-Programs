
import java.util.Vector;

public class ForEachMethod {

    public static void main(String[] args) {

        Vector<String> listOfCity = new Vector<>();
        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("Indore");
        listOfCity.add("Mumbai");

        listOfCity.forEach(city -> System.out.println(city));
    }
}
