package _09_LINKED_LIST;

public class D16_tut16 {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class DLinkedList{
        Node head = null;
        Node tail = null;
        Node prev = null;
        int size = 0;
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                 temp = temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        
    }
}
