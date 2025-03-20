package Loop;

import java.util.*;
public class reverse {
    public static void main(String args[]){
    int n,s,rev=0;
    System.out.println("Enter The Num :");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    while(n!=0){
         s=n%10;
        rev=rev*10+s;
        n=n/10;
    }
    System.out.println(rev);
    }
    }
