package _08_QUEUE;

public class D03_tut3 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LL_Queue{
    private Node front = null;
    private Node rear = null;
    private int size = 0;
        void add(int data){
            Node temp = new Node(data);
            if(isEmpty()){
                //head = temp;
                front = temp;
                rear = temp;
                size++;
                return;
            }
            rear.next = temp;
            rear = temp; 
            size++; 
        }
        int peek(){
            if(front == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return front.data;
        }
        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        LL_Queue lq = new LL_Queue();
        lq.add(4);
        lq.add(5);
        lq.add(15);
        lq.add(50);
        lq.add(2);
        lq.remove();
        lq.add(10);
        lq.add(21);
        lq.remove();
        System.out.println(lq.size());
        lq.display(lq.front);
        System.out.println();
        System.out.println(lq.front.data);
        System.out.println(lq.rear.data);
        System.out.println(lq.peek());
        System.out.println(lq.isEmpty());
    }
}
