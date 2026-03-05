import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        
        String reverse = "";

        for(int i = s.length()-1 ; i>=0 ; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO!");
        }
    }
}
