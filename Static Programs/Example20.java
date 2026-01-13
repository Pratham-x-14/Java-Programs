class Example20 
{
	static int a;

	int a = 40;
	
	static int initialize() 
	{ 
		Example20.a = 50;
		return 60;
	}

	 

	public static void main(String[] args)
	{
		System.out.println(Example20.a); 
		Example20.a = Example20.initialize();
		System.out.println(Example20.a);
	}

	
}


