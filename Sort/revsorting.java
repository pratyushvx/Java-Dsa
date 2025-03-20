import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class revsorting {
    public static void main(String[] args) {
           Integer a[];
           int n;
        System.out.println("Enter Size of the array");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        a=new Integer[n];
        System.out.println("Enter element in the array");
        for(int i=0;i<a.length;i++){
         a[i]=sc.nextInt();
        }
        //Arrays.sort(a,Collections.reverseOrder());// Inverse Sorting Array Inbuilt function
       Arrays.sort(a,0,3,Collections.reverseOrder());//Sorting in index

        System.out.println("Sorted Array is : ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }  
        
    }
    
}
