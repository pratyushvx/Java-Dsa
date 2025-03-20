import java.util.Scanner;
import java.util.*;
public class frequency_each {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int a[]=new int[6];
       for(int i=0;i<6;i++){
        a[i]=sc.nextInt();

       } 
       Arrays.sort(a);
       for(int i=0;i<6;i++){
    int key=a[i];
    int count=0;
    if( i>0 && a[i]==a[i-1]){
        continue;
    }
    for(int j=0;j<6;j++){
       if(a[j]==key){
        count++;
       }

    }
    System.out.println("count of "+ key +" is"+count);

       }
    }
}
