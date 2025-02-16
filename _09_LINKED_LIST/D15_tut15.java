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
    public static void main(String[] args) {
        
    }
}
