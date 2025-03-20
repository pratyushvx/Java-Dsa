
import java.util.*;
public class addone

{
	public static void main(String[] args) {
	    int s,size=0;
		

         Scanner sc=new Scanner (System.in);
         System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int digit[]=new int[n];
        System.out.println("Enter element in Array");
        for(int i=0;i<n;i++){
            digit[i]=sc.nextInt();
        }
        int num=0;
        Stack<Integer> q=new Stack<>();
        for(int i=0;i<digit.length;i++){
            num=num*10+digit[i];
        }
        num+=1;
        
        while(num>0){
         s=num%10;
         q.push(s);
         size++;
         num=num/10;
        }
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=q.pop();
        }
        System.out.print("Added array are: ");
      for(int i=0;i<size;i++){
          System.out.print(a[i]+" ");
      }

	}
}
