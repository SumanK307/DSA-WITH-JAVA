package _08_QUEUE;

public class D06_tut6{
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