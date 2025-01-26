package _08_QUEUE;

public class D04_tut4 {
    public static class CircularQueue{
        int n = 10;
        private int[] arr = new int[n];
        private int size = 0;
        private int rear = -1;
        private int front = -1;
        void add(int x){
            if(isFull()){
                System.out.println("Queue is full.");
                return; 
            }
            else if(size == 0){   
                arr[++front] = x;
                rear++; 
                size++;
                return;
            }
            else if(n-1 == rear){
                rear = 0;
                arr[0] = x;
                size++;
                return;
            }
            arr[++rear] = x;
            size++;
        }
        void remove(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return;
            }
            else if(front == n-1){
                arr[front] = 0;
                front = 0;
                size--; 
                return;
            }
            arr[front] = 0;
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
                System.out.println("Queue is Empty.");
            }
            else{
                for (int i = 0; i <= n-1; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.add(9);
        cq.add(10);
        // System.out.println("r"+cq.rear);
        // System.out.println("f"+cq.front);
        // System.out.println("s"+cq.size());
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.display();
        cq.add(11);
        cq.add(21);
        cq.add(31);
        cq.display();
        // cq.remove();
        // cq.remove();
        System.out.println("f"+cq.front);
        System.out.println("r"+cq.rear);
        System.out.println("s"+cq.size());
        System.out.println(cq.peek());
        System.out.println();
        cq.remove();
        cq.remove();
        //cq.display();
        // cq.add(11);
        cq.add(22);
        cq.add(33);
        cq.add(34);
        cq.remove();
        System.out.println("r"+cq.rear);
        System.out.println("f"+cq.front);
        System.out.println("s"+cq.size());
        cq.display();
        System.out.println("r"+cq.rear);
        System.out.println("f"+cq.front);
        System.out.println("s"+cq.size());
        System.out.println(cq.peek());
        
    }
}
