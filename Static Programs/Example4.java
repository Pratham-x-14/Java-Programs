public class Example4 
{
    static int x = 10;

    static 
    {
        System.out.println("Static Block 1: " + x);
        x = m1();
    }

    static 
    {
        System.out.println("Static Block 2: " + x);
        x += 5;
    }

    static int m1() 
    {
        System.out.println("m1 executed");
        return 20;
    }

    public static void main(String[] args) 
    {
        System.out.println("Main: x = " + x);
    }
}
