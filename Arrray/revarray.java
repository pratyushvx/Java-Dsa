import java.util.*;
public class revarray {
    public static void main(String args[]){
        int a[],temp,n,j,i;
        System.out.println("Enter the Size of the array ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the Element in the array");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
     int first=0;
     int last=a.length-1;
     while(first<last){
         temp=a[first];
         a[first]=a[last];
         a[last]=temp;
         first++;
         last--;
        
     } 
     System.out.println("Reversed Array is:");
     for(i=0;i<n;i++){
        System.out.println(a[i]);
     }

        }
      
        
    }
    

