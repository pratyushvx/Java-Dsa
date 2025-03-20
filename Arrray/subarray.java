import java.util.*;
public class subarray {
    public static void main(String[] args) {
        int a[],n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        n=sc.nextInt();
        a=new int[n];
     
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            int temp[]=new int[10*a.length];
            
            
            for(int j=i;j<a.length;j++){
                
                 temp[j]=a[j];
                 for(int k=0;k<=j;k++){
                    System.out.print("("+temp[k]+",");

                 }
                 System.out.print(")\n");
               
            }
            System.out.println();
        }

    
    
    }
    
}
