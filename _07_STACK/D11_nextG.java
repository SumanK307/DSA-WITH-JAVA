package _07_STACK;

import java.util.Scanner;

public class D11_nextG {
    // Q.1 print next greater element in array using Stack
//      [4,7,3,9,6,8] -> [7,9,9,-1,8,-1]
// Q.2 2nd Approach
// Q.3 previous greater 
public class _10_NextGreater {
    public static void Print(int[] arr,int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    
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
