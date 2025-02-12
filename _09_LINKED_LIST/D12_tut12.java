package _09_LINKED_LIST;

public class D12_tut12{
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
            if (head == null) { // for empty list
                head = temp;
                tail = temp;
            } else { // for available list
                tail.next = temp; // present tail ko temp se connect karega
                tail = temp; // tail new value ko bana dega
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
    // Using Extra space 
    public static void main(String[] args) {
        
    }
}