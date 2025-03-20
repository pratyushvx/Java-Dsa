import java.util.*;
public class even {
    public static void main(String[] args) {
     //Reverse an Array
    int a[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<9;i++){
        a[i]=sc.nextInt();
    } 
    for(int i=0;i<=4;i++)
    {
        int temp=a[i];
        a[i]=a[8-i];
        a[8-i]=temp;

    }
    for(int s=0;s<9;s++){
        System.out.print(a[s]+" ");

    }
    
}
}
