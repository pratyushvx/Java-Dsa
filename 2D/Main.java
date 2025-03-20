import java.util.*;
public class Main{
    public static void main(String args[]){
         
      Scanner sc=new Scanner(System.in);
      int a[][]=new int[3][3];
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              a[i][j]=sc.nextInt();
          }
      }
  
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
          if(a[i][j]==0){
              
              int m=j;
             int g=i;
              
              
              for(int s=0;s<3;s++){
                  a[s][m]=Integer.MIN_VALUE;
              }
              
              for(int k=0;k<3;k++){
                  a[g][k]=Integer.MIN_VALUE;
              }
          }
         
            
      }
      }
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
             if(a[i][j]==Integer.MIN_VALUE){
                 a[i][j]=0;
             }
          }
          
      }
      
     
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
              System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
      
      
      
      
      
      
      
      
      
    }
}