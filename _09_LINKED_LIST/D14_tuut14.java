package _09_LINKED_LIST;

public class D14_tuut14 {
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
        int RemoveDuplicate(Node head){
            Node temp = head;
            while(temp != null){
                if(temp.next == null) return -1;
                if(temp.data == temp.next.data){
                    // if(temp.next.next == null) return -1;
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            return 1;
        }

    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(12);
        li.insertAtEnd(12);
        li.insertAtEnd(3);
        li.insertAtEnd(4);
        li.insertAtEnd(4);
        li.insertAtEnd(1);
    }
}
