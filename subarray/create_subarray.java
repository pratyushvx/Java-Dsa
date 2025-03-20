import java.util.*;
public class create_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],n;
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter element in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //printing subarray
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
    
}
