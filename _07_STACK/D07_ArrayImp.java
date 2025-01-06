package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D07_ArrayImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Stack st = new Stack();
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);         
         st.display();
         System.out.println(st.peek());
         System.out.println(st.pop());
         st.display();
         System.out.println(st.peek());
         System.out.println(st.size());
         st.display();
    }    
}
