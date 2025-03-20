import java.util.*;
public class markupdate {
    public static void update(int mark[],int n){
        
        for(int i=0;i<n;i++){
            mark[i]+=2;
        }

     n+=2;
    }
    public static void main(String args[]){
        int mark[],n;
        System.out.println("Enter total no of subjects");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        mark=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter mark of subject");
            mark[i]=sc.nextInt();
        }
        update(mark,n);
        System.out.println("updated mark");
        for(int i=0;i<n;i++){
          
            System.out.println(mark[i]);
        }
        System.out.println(n);



    }
    
}
