
public class P 
{    
	void m1()   
	{        
		System.out.println("Inside A's m1 method");
    } 
	}
 class Q extends P {        
	 void m1()    {        // overriding m1()
		 System.out.println("Inside B's m1 method");    
		 } 
	 
 }
 class R extends P {        
	 void m1()    {       // overriding m1()
		 System.out.println("Inside C's m1 method");   
		 }
	 
 
 // Driver class class Runtime_Polymorphism    
	 public static void main(String args[])    
{  
		         
	 P p = new P();	// object of type P
 }
             
 Q q = new Q();	 // object of type Q   
                
 R r = new R();	// object of type R 
         
 P ref;      // obtain a reference of type P                          
 ref = p;	// ref refers to an P object
                 
 ref.m1();	// calling P’s version of m1()
 
            
 ref = q;	 // now ref refers to a Q object   
                
 ref.m1();	// calling Q’s version of m1()
               
 ref = r;	// now ref refers to a R object  
                 
 ref.m1();    // calling R’s version of m1()
 } 
 }

