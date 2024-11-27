package _05_ARRAY;
import java.util.*;

public class D05_Five {

    //**********************Binary Search**********************/
    static int search(int[] arr, int target){
        int start = 0;
        int end   = arr.length-1; 


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print(" Enter " + n + " Elements: "); 
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.print(" Enter target Element which you want to Find: ");
        int target = sc.nextInt();
    }
}
