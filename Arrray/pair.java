import java.util.*;
public class pair{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[],n;
        System.out.println("Enter the Size of the Array");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int tp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+")");
                tp++;
            }
            sc.close();
            System.out.println();
        }
        System.out.println("Total Pairs="+tp);
    }









































}