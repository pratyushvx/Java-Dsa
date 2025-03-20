 import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A,B;
        int hcf=0,lcm;
        A=sc.nextInt();
        B=sc.nextInt();
        
        for(int i=2;i<20;i++){
            if(A%i==0 && B%i==0){
               hcf=i;
               break;
            }
            else{
                hcf=1;
            }
            
        }
        lcm=((A*B)/hcf);
        System.out.println("LCM"+ lcm +" HCF:"+hcf);
        
    }
    
}
 
    

