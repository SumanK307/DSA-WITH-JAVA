package _09_LINKED_LIST;

public class D15_tut15 {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
             temp = temp.next;
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
             temp = temp.prev;
        }
        System.out.println();
    }
    public static void display3(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.data+" ");
             temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(8);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
         //always->  Tail.next = null & head.prve = null;
        System.out.print("By head!");
         display(a);
         System.out.print("By Tail!");
         display2(e);
         System.out.print("By Random!");
         display3(c);
    }
}
