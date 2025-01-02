package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D03_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
         st.push(3);
         st.push(8);
         st.push(2);
         st.push(6);         
         System.out.println(st);
         System.out.print("Enter the element:");
         int ele = sc.nextInt();
         System.out.print("Enter the index:");
         int ind = sc.nextInt();
         Stack<Integer> tt = new Stack<>();
         //**************Insertion in Stack**************/
         while (st.size()>ind) {
            tt.push(st.pop());
         } 
         st.push(ele);
         while (tt.size()>0) {
            st.push(tt.pop());
         }
         System.out.println(st);
    }    
}
