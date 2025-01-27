package _08_QUEUE;
import java.util.*;

public class D05_tut5{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        private int size = 0;
        boolean isEmpty(){
            return s1.isEmpty();      //if s1 empty then queue empty
        }
        void add(int val){
            if(s1.size() == 0){
                s1.push(val);
                size++;
                return;
            }
            while (s1.size() != 0) {
                s2.push(s1.pop());
            }
            s1.push(val);
            while (s2.size() != 0) {
                s1.push(s2.pop());
            }
            size++;
        }
        void remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty.");
                return; 
            }
            s1.pop();
            size--;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty.");
            }
            return s1.peek();
        }

    public static void main(String[] args) {

    }
}