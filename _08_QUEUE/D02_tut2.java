package _08_QUEUE;
import java.util.*;

public class D02_tut2 {
    public static class ArrQueue{
        private int[] arr = new int[7];
        private int size = 0;
        private int rear = -1;
        private int front = -1;
        void add(int x){
            if(isFull()){
                System.out.println("Queue is full!");
                return; 
            }
            if(size == 0){   
                arr[++front] = x;
                rear++; 
                size++;
                return;
            }
            arr[++rear] = x;
            size++;
        }
        void remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            front++;
            size--;  
        }
        int peek(){
            return arr[front];
        }
        boolean isEmpty(){
            if(size == 0)
                return true;
            return false;
        }
        boolean isFull(){
            if(size == arr.length)
                return true;
            return false;
        }
        void display(){
            if (size == 0) {
                System.out.println("Queue is Empty!");
            }
            else{
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        ArrQueue aq = new ArrQueue();
        aq.add(6);
        aq.add(61);
        aq.add(60);
        aq.add(2);
        System.out.println(aq.peek());
        aq.remove();
        System.out.println(aq.peek());
        System.out.println(aq.size());
        aq.display();
        System.out.println();
        aq.add(5);
        aq.add(5);
        aq.remove();
        aq.add(5);
        System.out.println(aq.peek());
        System.out.println("r"+aq.rear);
        System.out.println("f"+aq.front);
        System.out.println(aq.peek());
        System.out.println(aq.size());
        System.out.println(aq.arr.length);
        aq.display();
    }
}
