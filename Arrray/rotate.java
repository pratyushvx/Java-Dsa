import java.util.*;
public class rotate {
    public void rotate1place(int [] a){
     int first=a[0];
     for(int i=0;i<a.length-1;i++){
        a[i]=a[i+1];
     }
     a[a.length-1]=first;
     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
     }
    }
    
            public void rotate(int[] nums, int k) {
              int a[]=new int[k];
              for(int i=0;i<a.length;i++){
                a[i]=nums[i];
              }
              for(int i=0;i<nums.length-k;i++){
                nums[i]=nums[i+k];
              }
              for(int i=0;i<k;i++){
                nums[nums.length-k+i]=a[i];
              }
                
              for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
             }
                
            }
        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter element in the Array");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    rotate r=new rotate();
    // r.rotate1place(a);
    System.out.println();
    r.rotate(a,3);
}
    
}
