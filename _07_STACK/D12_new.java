package _07_STACK;

import java.util.*;

public class D12_new {
    public static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] stockSpan(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[0] = 1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i] ){
                st.pop();
            }
            // while (arr[i] < arr[st.peek()] && !st.isEmpty()) {
            //     res[i] = i - st.peek();
            // }
            if (st.isEmpty()) {
                res[i] = i + 1;
            } 
            else {  
                res[i] = i - st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Print(arr, n);
        int[] res = stockSpan(arr, n);
        Print(res, n);
    }
}
