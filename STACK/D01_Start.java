package STACK;

import java.util.Stack;

public class D01_Start {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>(); 
         st.push(3);
         st.push(8);
         st.push(2);
         st.pop();
         System.out.println(st);
         System.out.println("Peek Element:"+st.peek());
         System.out.println("Total Element:"+st.size());
         System.out.println("IS Empty:"+st.isEmpty());

    }
}
