import java.util.Map;
import java.util.Hashtable;
import java.util.HashMap;

public class HashtableTest 
{
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("ravi@gmail.com","ravi123");
        map.put("raj@gmail.com", "raj1234");

        System.out.println(map);
    }
}
