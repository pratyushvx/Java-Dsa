package Loop;
import java.util.*;


class seclargestamong3
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a>=b) && (a>=c)){
		   if(b>=c){
		       System.out.println("b is second largest");
		   }
		   else{
		       System.out.println("c is second largest");
		   }}
		   else if((b>=c) && (b>=a)) {
		       if (c>=a){
		           System.out.println("c is second largest");
		       }
		       else 
		       {
		          System.out.println("a is second largest");
		       }}
		       else if(b>=a){
		           System.out.println("b is second largest");
		       }
		       else{
		           System.out.println("a is second largest");
		       }
		   }
		  }
		   
	
	
	
	
	
	