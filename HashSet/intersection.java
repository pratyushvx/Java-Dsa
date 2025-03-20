import java.util.HashSet;
import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        int a[]={1,2,5,4,7,8};
        int b[]={1,4,7,8,0,7};
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                if(!list.contains(b[i])){//if 2nd array have duplicate element
                list.add(b[i]);
                }
            }
        }
        //list.add(6);
        System.out.println(list);

    }
    
}
