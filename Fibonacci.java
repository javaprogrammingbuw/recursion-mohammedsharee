
import java.util.Scanner;
public class Fibonacci {
	
	
    public static void main(String[] args) {
    	
    	Scanner scan =new Scanner(System.in);
    	
    	System.out.println("Enter the Number");
    	int n = scan.nextInt();
    	int fibonacci = fibRek(n);
    	
//    	int fibonacci = fib(n);  / Iterative method
    	
   System.out.println("fibonacci is " + fibonacci);

         }
	
//	Iterative method
	
public static int fib (int n) {
		int a = 0;
	 	int b = 1;
	       
	        for (int i = 1; i <= n; i++)
	        {
	          
	            int sum = a + b;
	            a = b;
	            b = sum;	            
	        }
	        
		return a;
			
	} 
	
	
//	recursive method


	public static int fibRek (int n) {
		if (n == 0 )
			return 0;
		else if (n>1)
			return fibRek(n-1)+(n-2);
		else
		return n;
		
		
	}

    }
	
