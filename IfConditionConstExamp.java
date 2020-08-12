import java.util.Scanner;

public class IfConditionConstExamp {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int x;
		int n;
		
		System.out.println ("Let's Play number game!!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println(" TYPE NUMBER HERE 1 OR 2 ?");
		n=sc.nextInt();
		
		if (n == 1) {
			System.out.println(" YEA YOU WIN \\(^__^)// " );
		} else {
		 	System.out.println(" SERIOUSLY ? <<(0 __ 0)>> " );
		   }
			
		System.out.println("************");
		System.out.println ("Let's Play another game? Why not?");
		sc=new Scanner(System.in);
		System.out.println("What month is it now? Type in NUMBER ===>> ");
		System.out.println(" ");
		x=sc.nextInt();
		
		int month=x;;
		String season;
		if(month==12||month==1||month==2)
			season = "Winter";
		else if(month==3||month == 4|| month == 5)
			season = "Spring";
		else if(month==6||month == 7|| month == 8)
			season = "Summer : Dmmm!! Hot like Hell in Texas";
		else
			season = "Ahhhh WHAT now?";
		System.out.println("It's : " + season);
	}
}
