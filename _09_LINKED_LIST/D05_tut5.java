package _09_LINKED_LIST;

public class D05_tut5 {
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

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
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
    public static void main(String[] args) {
        
    }
}
