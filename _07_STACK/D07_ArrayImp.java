package _07_STACK;

import java.util.Scanner;
import java.util.Stack;

public class D07_ArrayImp {
    public static class Stack{
        private int[] arr = new int[15];
        private int ind = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full.");
                return; 
            }
             arr[ind] = x; 
             ind++;
        }
        int peek(){
            if(ind==0){
                System.out.println("Stack is Empty.");
                return -1;
            }
        return arr[ind-1];
        }
        int pop(){
            if(ind==0){
                System.out.println("Stack is Empty.");
                return -1;
            }
            int top = arr[ind-1];
            arr[ind-1] = 0;
            ind--;
            return top;
        }
        boolean isEmpty(){
            if(ind == 0)
                return true;
            return false;
        }
        boolean isFull(){
            if(ind == arr.length)
                return true;
            return false;
        }
        void display(){
            for (int i = 0; i < ind; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return ind;
        }
    }
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
