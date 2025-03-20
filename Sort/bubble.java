import java.util.*;
public class bubble{
    public static void bubblesort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
 
    }
    public static void selectionsort(int a[],int n){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    } 
    public static void insertion(int a[]){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]> curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
     
    }
    public static void print(int a[]){
        System.out.print("Sorted Array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
    }
}
    public static void main(String[] args) {
        int a[],n,ch;
        System.out.println("Enter size of the array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a= new int[n];
        System.out.println("Enter Element in the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter choices \n1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort");
        ch=sc.nextInt();
        switch(ch){
       case 1:bubblesort(a);
       break;
       case 2:selectionsort(a,n);
       break;
       case 3:insertion(a);
       break;
       default:System.out.println("Invalid input");
        }
       print(a);
       
        }

        }


       
