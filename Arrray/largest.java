import java.util.*;
public class largest {
    public static void main(String[] args) {
        int a[],large=0,min=Integer.MIN_VALUE;
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>min){
                min=a[i];

            }
        }
        System.out.println("Largest is " +min);
    }
    
}
