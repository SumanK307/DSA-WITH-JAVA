package _07_STACK;

import java.util.Scanner;

public class D11_nextG {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            int[] arr = new int[n]; 
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Print(arr, n);
            //int[] res = nextGreater(arr, n);
            // int[] res = nextGreater2(arr, n);
    }
}
