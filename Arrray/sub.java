import java.util.*;
public class sub {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element in the Array");
        for(int m=0;m<n;m++){
            a[m]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    if(k<j){
                        System.out.print(a[k]+",");
                    }
                    if(k==j){
                        System.out.print(a[k]);
                    }
                }
                System.out.println("]");
            }
            System.out.println();
        }
}
    
}
