package _09_LINKED_LIST;

public class D11_tut11 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void Display(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        
    }
}
