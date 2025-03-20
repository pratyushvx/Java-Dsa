import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       
        int s[]=new int[n];
        s[0]=a[0];
        int i=1,j=0;
        while(i<n){
        
            if(a[i]==s[j]){
                i++;
            }
            else{
                s[j+1]=a[i];
                j++;
                i++;
            }
        }
        for(int z=0;z<n;z++){
            if(s[z]==0){
                System.out.println(" ");
            }
            else{
            System.out.print(s[z]+" ");
            }
        }
    }
    
}
