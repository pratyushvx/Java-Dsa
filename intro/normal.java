public class normal {
    static void swap(Integer x,Integer y){
        Integer temp;
        temp=x;
        x=y;
        y =temp;
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        Integer x=a;
        Integer y=b;
        swap(x,y);
        System.out.println(x+"\n"+y);
    }
}
