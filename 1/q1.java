import java.util.*;
public class q1{
    public static void main(String args[]){
       int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Number");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
        float avg;
        avg= (a+b+c) / (float)3;
        System.out.println("Average :-"+avg);
        sc.close();
     }
}