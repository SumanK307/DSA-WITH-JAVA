package _09_LINKED_LIST;


public class D04_tut4 {
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
                System.out.println(temp.data + " " + temp);  // temp -> print address
                temp = temp.next;
            }
        }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
        li.insertAtEnd(6);
        li.insertAtEnd(1);
        li.insertAtInd(9, 3);
        li.Display();
        System.out.println("LL tail value is:"+li.tail.data);
        System.out.println("LL head value is:"+li.head.data);
        // System.out.println("at index value is:"+li.getIndVal(3));
        System.out.println("LL Size is:"+ li.size);
        li.Display();
        System.out.println("LL Size is:"+ li.size);
        System.out.println("LL tail value is:"+li.tail.data);
        System.out.println("LL head value is:"+li.head.data);
    }    
}
