class DailyTask
{
		static 
		{
			int x = 10;
			DailyTask.x = x+x;
		}

		static int x;
		
		static 
		{
			x = x + DailyTask.x;
		}
		public static void main(String[] args) 
		{
			IO.println("Main");
			System.out.println("Class Level X : "+DailyTask.x);
		}

}
	
