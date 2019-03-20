import java.util.Scanner;

public class RecLoop{

	
	
	 public static void main(String[] args) {
	    	
	    	Scanner scan =new Scanner(System.in);
	    	
//	    	System.out.println("Enter the value of A");
	    	System.out.println("Enter the value of base"); 
//	    	int a = scan.nextInt();
	    	int base = scan.nextInt();
//	    	System.out.println("Enter the value of b");
	    	System.out.println("Enter the value of power");
//	    	int b = scan.nextInt();
	    	int pow = scan.nextInt();
	    	
//	    	int euclid = euclidIterative(a,b);
	    	double euc = powRecursive(base,pow);
	    	System.out.println(euc);
	 }
	    	
	
	 public static int euclidIterative(int a, int b) {


	        while (a != b) {
	        	if(a > b)
	                a = a - b;
	            else
	                b = b - a;
	        }

	        System.out.printf("GCD of given numbers is" + a);
			return b;
	    }

	 public static double powRecursive(final double base, final int pow) {
		 if (pow < 0) {
				System.out.println("Values are negative");
				return -1;
			  }else if (pow==0) {
				  return 1;
				  
			  }else {
				  return base*powRecursive(base,(pow-1));
			  }
	   }
	 }		 
		
