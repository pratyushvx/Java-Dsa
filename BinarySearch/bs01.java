import java.util.*;
public class bs01{
    //implement lower bound
    public static void lowerbound(int a[],int x){
        int low=0,high=a.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=x){
                high=mid-1;
            index=mid;
            }
            else{
                
                low=mid+1;
            }
            
        }
        System.out.println(index+" "+a[index]);
    }
    public static void upperbound(int a[],int x){
        int low=0,high=a.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>x){
                high=mid-1;
            index=mid;
            }
            else{
               
                low=mid+1;
            }
            
        }
        System.out.println(index+" "+a[index]);
    }
    public static void main(String[] args) {
       int a[]=new int[7];
       System.out.println("Enter no:");
       for(int i=0;i<7;i++){
       Scanner sc=new Scanner(System.in);
       a[i]=sc.nextInt();
       }
       for(int i=0;i<7;i++){
        System.out.print(a[i]+" ");
       }
       System.out.println();
       lowerbound(a,4);
       upperbound(a,4);
       


    }
}