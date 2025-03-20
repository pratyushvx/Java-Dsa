//Second largest and Largest in Array --Most optimised
import java.util.*;
public class slargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int l=a[0];
       int sl=-1;
        for(int i=1;i<n;i++){
        if(a[i]>l){
            sl=l;
            l=a[i];
        }
        else if(a[i]>sl ){
            sl=a[i];
        }
        
        }

        System.out.println("Largestis " +l);
        System.out.println("Second largest is " +sl);
    }
}