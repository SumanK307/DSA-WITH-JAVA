package _08_QUEUE;
import java.util.*;

public class D05_tut5{

    public static void main(String[] args) {
        public static class Queue{
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
        
    }
}