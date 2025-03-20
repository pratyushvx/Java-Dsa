import java.util.*;
public class constant {
    static void merge(int a[], int first, int mid,int last){
        int f = first;
        int m = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(f<=mid && m<=last){
            if(a[f]<=a[m]){
                list.add(a[f]);
                f++;
            }
            else{
                list.add(a[m]);
                m++;
            }
        } 
        while(f<=mid){
            list.add(a[f]);
            f++;
        }
        while(m<=last){
            list.add(a[m]);
            m++;
        }
        for(int i=first;i<=last;i++){
            a[i]=list.get(i-first);
        }
    }
    static void mergeSort(int[] a,int first,int last){
        if(first<last){
            int mid = (first + last)>>1;
            mergeSort(a,first,mid);
            mergeSort(a,mid+1,last);
            merge(a,first,mid,last);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergeSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
    
}
