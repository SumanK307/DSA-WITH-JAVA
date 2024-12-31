package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D02_Imp {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
         System.out.print("Enter the no of element:");
         int n = sc.nextInt(); 
         // normal order
         for (int i = 1; i <= n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
         }
         System.out.println(st);
    }
}
