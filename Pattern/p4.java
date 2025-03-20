import java.util.*;
public class p4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n= sc.nextInt();
        char p='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p++;
            }
           System.out.println(); 
        }
    }
}