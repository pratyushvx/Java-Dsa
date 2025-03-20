import java.util.*;
public class spiral {
    public static void main(String args[]){
        int a[][],m,n;
        System.out.println("Enter Size of the 2D array:");
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
        n=s.nextInt();
        a=new int[m][n];
        // System.out.println(a[0].length);
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[0].length-1;j++){
                a[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[0].length-1;j++){
                System.out.print(
                a[i][j]+"\t");
            }
            System.out.println();
        }

        int sr=0,er=a.length-1,sc=0,ec=a[0].length-1;
        while(sr<=er&&sc<=ec){
            for(int j=sc;j<=ec;j++){
                System.out.print(a[sr][j]+"\t");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(a[i][ec]+"\t");
            }
            for(int j=ec-1;j>=sc;j--){
                if(sc==ec){
                    break;
                }
                System.out.print(a[er][j]+"\t");
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(a[i][sr]+"\t");

            }
            sr++;
            sc++;
            er--;
            ec--;
        }

    }
    
}
