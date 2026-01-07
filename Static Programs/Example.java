public class Example
{
	static 
    {
    	 x = m1();
        System.out.println(Example.x);         
    }

    static int x = 100;
    
    static int m1() 
    {
    	System.out.println(x);
        x = 40;
        return x + 20;
    }

    public static void main(String[] args) 
    {
        System.out.println(x);  
    }
}