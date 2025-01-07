package _07_STACK;

import java.util.*;

public class D08_new {

    public static void reverse(Stack<Integer> st){ 
        if (st.size() == 0) 
            return;
        int tem = st.pop();
        reverse(st);                          
        st.push(tem);
    }
    public static void reverseStack(Stack<Integer> st){ 
        if (st.size() == 1) 
            return;
        int tem = st.pop();
        reverse(st);
        InsertAtBottom(st,tem);
    }
    public static void main(String[] args){
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
