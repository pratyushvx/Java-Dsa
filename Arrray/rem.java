import java.util.*;
import java.util.Scanner;

public class rem {
    public static void main(String[] args) {
        int a[],n,i,size;
        System.out.println("Enter the Size of the array ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the Element in the array");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int val=2,m=0;
              for(i=0;i<a.length;){
                if(a[i]==val){
                    m++;
                    if(i==a.length-1){
                        break;
                    }
                    for(int j=i;j<a.length-1;j++){
                        a[j]=a[j+1];
                    }
                    
                }
                else{
                    i++;
                }
                n=i;
              }
              for( i=0;i<n-m;i++){
                System.out.println(a[i]);
            }
              
        }
        
        }
