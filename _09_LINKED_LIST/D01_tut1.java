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
        
    }
}
