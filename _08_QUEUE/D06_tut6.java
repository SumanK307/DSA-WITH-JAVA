package _08_QUEUE;

import java.util.LinkedList;

public class D06_tut6{
    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();      //if s1 empty then queue empty
        }
        void push(int x){
            if(!q1.isEmpty()){
                q1.add(x);
            }
            else{
                q2.add(x);
            }
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1; 
            }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
        //s.peek();
    }
}