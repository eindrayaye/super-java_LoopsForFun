public class ChristmasTree {

	public void Call1()
	{
		int b=9,c=1;
				
		for (int i = 1; i <= 10; i++)
		{
			System.out.println();
			
			for (int j=1; j<=b;j++)
			{System.out.print(" ");}
						
			for(int k=1; k<=c; k++)
			{System.out.print("*");}
			
			b--;
			c=c+2;			
	    }
	}	
	public void Call2()
	{
		int r=6,start;
		System.out.println();
		
		for (int i=1;i <=r; i++)
		{
			for(int j=1;j<=i;j++)
			{System.out.print("  *");}
		
			start=i + 1;
			for (int k=start;k<=6;k++)
			{System.out.print("  *");}
		
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		ChristmasTree c1=new ChristmasTree();
		c1.Call1();
		c1.Call2();

     }
}
		
