import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryTest {
    public static void main(String[] args) {

        Dictionary<String, String> d = new Hashtable<>();

        d.put("ravi@gmail.com", "ravi1234");
        d.put("raj@gmail.com", "raj1234");
        d.put("scott@gmail.com", "scott1234");

        d.remove("raj@gmail.com");

        System.out.println(d);
    }
}
