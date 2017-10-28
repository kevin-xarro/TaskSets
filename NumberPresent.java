import java.util.Scanner;
public class NumberPresent {
	public static void main(String[] arg)
	{

Scanner in  = new Scanner(System.in);

int c, n, search, array[];

System.out.print("Enter number of elements");

n = in.nextInt();
array = new int[n];

	 
	    
System.out.println("\nEnter " + n + " integers");
for (c = 0; c < n; c++)
	
 array[c] = in.nextInt();
	 
	    
System.out.print("\nEnter value to find");
	    
search = in.nextInt();
	    
System.out.println("\n");
	    
for (c = 0; c < n; c++)
	    
{
	      
if (array[c] == search)     /* Searching element is present */
	      
{
	         
System.out.println(search + " is present at location " + (c + 1) + ".");
	          
break;
	      
}
	   
}
	   
if (c == n)  /* Searching element is absent */
	      
System.out.println(search + " is not present in array.");
		
in.close();
	
}

}


