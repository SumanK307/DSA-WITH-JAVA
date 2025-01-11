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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
