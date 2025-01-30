package _09_LINKED_LIST;

public class D01_tut1 {
    public static class Node{
        int data;   //value
        Node next;  //address of next node
        Node(int data){
            this.data=data;
        }
    }

    public static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void Display2(Node head){
        Node temp = head;
        if(temp == null){ return; }
            System.out.print(temp.data+" ");
            Display2(temp.next);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        System.out.println(a.next);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(16);         
        a.next = b;
        System.out.println(a);          //LINKED_LIST._01_linkedList$Node@4617c264
        System.out.println(a.next);     //LINKED_LIST._01_linkedList$Node@36baf30c
        System.out.println(b);          //LINKED_LIST._01_linkedList$Node@36baf30c
        System.out.println(c);          //LINKED_LIST._01_linkedList$Node@7a81197d   
        
    }
}
