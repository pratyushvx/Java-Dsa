import java.util.*;
public class selection{
    public static void selectionsort(int a[],int n){
        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=0;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[],n;
        System.out.println("Enter the Size of the array:");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
           
        }
    selectionsort(a,n);
    for(int i=0;i<n-1;i++){
        System.out.print(a[i]+"");
    }
    }
}