import java.util.*;
public class dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       
      int i=0,j=0;
      while(j<n){
        if(a[i]==a[j]){
            j++;
        }
        else{
            a[i+1]=a[j];
            i++;
            j++;

        }
      }
      for(int p=0;p<=i;p++){
           System.out.print(a[p]+" ");
        }  
      
    }
    
}
