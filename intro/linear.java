import java.util.Scanner;


public class linear{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int n,key,a[];
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter Elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Key element to vbe searched");
        key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("Element present");
                break;
            }
            if(i==n)
            System.out.println("Not present");
        }







        sc.close();
    }
}