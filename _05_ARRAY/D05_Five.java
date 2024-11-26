package _05_ARRAY;
import java.util.*;

public class D05_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print(" Enter " + n + " Elements: "); 
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
    }
}
