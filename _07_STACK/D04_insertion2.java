package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D04_insertion2 {
    public static void InsertAtBottom(Stack<Integer> st,int ele){
        if(st.size() == 0){ 
            st.push(ele);
            return;
        }
        int tem = st.pop();
        InsertAtBottom(st,ele);
        st.push(tem);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);         
         System.out.println(st);
         InsertAtBottom(st, 12);
         System.out.println(st); 
    }
}