import java.util.*;
public class largest1 {
    public static void main(String[] args) {
        int a[],large=0;
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        a=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>min){
                large=a[i];

            }
        }
        System.out.println("Largest is " +large);
    }
    
}
