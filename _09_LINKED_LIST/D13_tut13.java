package _09_LINKED_LIST;

public class D13_tut13 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

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
        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void OddEven(Node head){
            Node temp  = head;
            Node head1 = new Node(10);
            Node temp1 = head1;
            Node head2 = new Node(11);
            Node temp2 = head2;
            while(temp!=null){
                if(temp1 != null && temp.data % 2 == 0){
                    temp1.next = temp;
                    temp1 = temp1.next;
                    temp = temp.next;
                }
                else if(temp2 != null && temp.data % 2 != 0){
                    temp2.next = temp;
                    temp2 = temp2.next;
                    temp = temp.next;
                }
            }
            System.out.print("Enen:");
            Display(head1.next);
            System.out.print("Odd:");
            Display(head2.next);
        }
    }
    public static void main(String[] args) {
        
    }
}
