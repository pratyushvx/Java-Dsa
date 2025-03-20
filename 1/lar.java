public class lar {
    public static int find(int a,int b,int c){
        return (c<b)?((b<a)?a:b):((c<a)?a:c) ;
    }
    public static void main(String[] args) {
        int a=10,b=21,c=20;
        int e=find(a,b,c);
        System.out.println(e);
        // System.out.println;
    }
    
}
