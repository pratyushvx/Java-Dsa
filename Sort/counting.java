import  java.util.*;
public class counting{
    public static void main(String args[]){
    int a[],n,j=0;
       System.out.println("Enter the size of the array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
    System.out.println("Enter the element in the Array");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("hii");
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        largest=Math.max(largest, a[i]);
    }
    int count[]=new int[largest+1];
    for(int i=0;i<a.length;i++){
    count[a[i]]++;
    }

    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            a[j]=i;
            j++;;
            count[i]--;
        }
    }
System.out.println("Sorted Array is ");
for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}
    
}
}