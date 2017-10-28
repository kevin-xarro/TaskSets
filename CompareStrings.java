import java.util.Scanner;
public class CompareStrings {

	
		
		
	public static void main(String[] arg)
		
	{
			
	Scanner SC  = new Scanner(System.in);
			
	String str1, str2;
			
			
	System.out.print("Enter string1: ");
			
	str1=SC.nextLine();

			
	System.out.print("Enter string2: ");
			
	str2=SC.nextLine();		
			
			//compare strings
			
	if(str1.length()!=str2.length()){
				
	System.out.println("Strings are not same, lengths are different!!!");
				
	return;
			
	}
			
			
	boolean flg=true;
			
	for(int loop=0; loop<str1.length();loop++){
				
	if(str1.charAt(loop)!=str2.charAt(loop)){
					
	flg=false;
					
	break;
				
	}
			
	}
			
			
	if(flg)
	{
				
	System.out.println("Strings are same.");

			
	}
			
	else
	{
				
	System.out.println("Strings are not same.");

			
	}
			
	SC.close();

		
	}

	}
