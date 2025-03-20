import java.util.*;
import java.util.Scanner;
public class p5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and column in hallow rectangle");
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}