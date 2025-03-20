import java.util.*;
public class union {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[],b[],m,n;
        System.out.println("Enter the both size of the Array");
        m=sc.nextInt();
        a=new int[m];
        n=sc.nextInt();
        b=new int[n];
        System.out.println("Enter element in 1st array");
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element in the 2nd array");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int i=0,count=0;
        int c[]=new int[m];
        for(int j=0;i<m && j<n;){
            if(a[i]==b[j]){
              c[count]=a[i];  
            }
            else{
                if(a[i]<b[j]){
                    i++;
                }
            }
        }
        System.out.println("   h\n");
        for(int k=0;i<m;k++){
            System.out.println(c[k]);
        }

    }
    
}
