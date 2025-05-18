package _12_GRAPH;

public class D01_First {
    public static class Node {
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
        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");  
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        n=1;
        System.out.println(n);
    }
}
