


public class pass {
    public static void update(int a[],int update1){
        update1=10;
        for(int i=0;i<3;i++){
            a[i]=a[i]+1;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int update1=5;
        update(a,update1);
        for(int i=0;i<3;i++){
           System.out.println(a[i]);
        }
        System.out.println(update1);


        
        
        
    }
    
}
