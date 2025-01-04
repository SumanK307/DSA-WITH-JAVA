package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D05_ArrayImp {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
         st.push(3);
         st.push(8);
         st.push(2);
         st.push(6);         
         System.out.println(st);
         //*************Display through Array************/
        //  int n = st.size();
        //  int[] arr = new int[n];
        // for (int i = n-1; i >= 0; i--) {
        //     arr[i] = st.pop();
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
        
    }
}
