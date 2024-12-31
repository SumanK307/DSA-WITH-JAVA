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
          // reverse order
          Stack<Integer> rt = new Stack<>();
          while(st.size()>0){
             //int x = st.peek();
             rt.push(st.pop());
             //st.pop();
          }
          System.out.println(rt);
          Stack<Integer> gt = new Stack<>();
         while(rt.size()>0){
            gt.push(rt.pop());
         }
         System.out.println(gt);
    }
}
