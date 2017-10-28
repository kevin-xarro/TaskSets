import java.util.Scanner;
public class PrimeNumber {
	public static void main(String [] arg)			
	{
			
			
	int n, m=0;			

	boolean Prime=true;

			
	System.out.println("Enter any Number to check whether it is prime no or not: ");

	Scanner sc = new Scanner(System.in);	
			
	n = sc.nextInt();					
	for(int i=2; i<=n/2; i++)
	   		
	{
				
	m=n%i;
				
	if(m==0)
				
	{
					
	Prime=false;
					
	break;
				
	}
			
	}
			
					
	if(Prime)
				
	System.out.println(n+ " is Prime Number");
			
	else
		
			
	System.out.println(n+ " is not a Prime Number");

	}

	}



