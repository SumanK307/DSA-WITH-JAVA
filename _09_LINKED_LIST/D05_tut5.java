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
        void deleteAtHead(){
            head = head.next;
            size--;
        }
        void deleteAtInd(int ind){
            if (ind == 0) {
                deleteAtHead();
                return;
            }
            else if(ind == size-1){
                deleteAtend();
                return;
            }
            Node temp = head;
            for (int i = 1; i < ind ; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            //tail = temp;
            size--;
        }
        void deleteAtend(){
            Node sec_last = head;
            while (sec_last.next.next != null) {
                sec_last = sec_last.next;
            }
            sec_last.next = null;
            tail = sec_last;
            size--;
        }
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
        li.insertAtEnd(6);
        li.insertAtEnd(1);
        li.Display();
        li.deleteAtHead();
    }
}
