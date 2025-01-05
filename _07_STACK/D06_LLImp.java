package _07_STACK;

public class D06_LLImp {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LLStack{
        private Node head = null;
        private int size = 0;
        void push(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++; 
        }
        void display(Node head){
            Node temp = head;
            if(head == null)
                return;
            display(temp.next);
            System.out.print(temp.data+" ");
        }
        
    public static void main(String[] args) {
    LLStack st = new LLStack();
        st.push(4);
        st.push(3);
        st.push(7);
        st.push(9);
        st.display(st.head);
        System.out.println();
        System.out.println(st.pop());        
        st.display(st.head);
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
