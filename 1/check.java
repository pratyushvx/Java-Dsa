// WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
import java.util.*;
public class check{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
     int n= s.nextInt();
     if(n>=1){
        System.out.println("+ve Number");
     }
    else{
        System.out.println("-ve No");
    }
    }
}