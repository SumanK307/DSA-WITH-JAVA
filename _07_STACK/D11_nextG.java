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
    public static int[] nextGreater(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for (int i = n-2; i >=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() == 0)
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
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
