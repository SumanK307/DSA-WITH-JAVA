package _09_LINKED_LIST;

public class D07_tut7 {
    //LC Question-no(206)-> reverse LL 
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ "->");  
                temp = temp.next;
            }
            System.out.println("null");
        }
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) { 
                head = temp;
                tail = temp;
            } else { 
                tail.next = temp; 
                tail = temp; 
            }
            size++;
        }
        void reverse(){
            Node prev = null;
            Node curr = tail = head;  //tail=head; curr=tail; 
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }    
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
        li.insertAtEnd(9);
        li.insertAtEnd(2);
        li.insertAtEnd(1);
        li.Display();
    }
}
