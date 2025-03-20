//package exos;
import java.util.*;

public class Exos {
    public static void main(String[] args) {
        int a[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 elements in the array:");
        
        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        
        // Close the Scanner
        sc.close();
        
        // Sort the array
        Arrays.sort(a);
        
        // Remove duplicates from the sorted array
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }
        
        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int s = 0; s <= j; s++) {
            System.out.print(a[s] + " ");
        }
    }
}
