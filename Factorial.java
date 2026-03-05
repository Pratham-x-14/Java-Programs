import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());   // Reading input from STDIN

        int fact = 1;

        for(int i = 1 ; i<=n ; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);    // Writing output to STDOUT
    }
}
