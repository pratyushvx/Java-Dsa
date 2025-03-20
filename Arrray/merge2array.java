import java.util.*;
public class merge2array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[6];
    int b[]=new int [2];
    int c[]=new int[8];
    for(int i=0;i<6;i++){
        a[i]=sc.nextInt();

    }
    for(int i=0;i<2;i++){
        b[i]=sc.nextInt();
    }
    System.out.println("start");
    int count=0;
    int i=0,j=0;
    while(i!=6 && j!=2){
        if(a[i]<b[j]){
            c[count]=a[i];
            i++;
            count++;
        }
        else{
            c[count]=b[j];
            count++;
            j++;
        }
    }
    while(i<6){
        c[count]=a[i];
        count++;
        i++;

    }
    while(j<2){
        c[count]=b[j];
        j++;
    }
    for(int s=0;s<=count-1;s++){
        System.out.print(c[s]+" ");
    }


    }
    
}
