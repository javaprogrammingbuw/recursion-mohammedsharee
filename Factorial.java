import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int f = scan.nextInt();
	int Fact = Factorial(f);
		System.out.println("Factorial is"  +  Fact );
	
	
}
	
	public static int Factorial (int f) {
		if (f<=1) 
			return 1;
		else 
			return f*Factorial(f-1);
		
	}	

	
}	
	


