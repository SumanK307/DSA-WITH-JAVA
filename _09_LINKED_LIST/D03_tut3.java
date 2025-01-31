package _09_LINKED_LIST;

public class D03_tut3 {
    public static class Node{
        int data;   
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.InsertAtHead(5);
        li.InsertAtHead(4);

    }    
}
