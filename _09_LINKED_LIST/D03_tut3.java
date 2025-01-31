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
        void InsertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){           // for empty list
                head = temp;
                tail = temp;
            }
            else{                       // for available list
                temp.next = head;       // present tail ko temp se connect karega
                head = temp;            // tail new value ko bana dega
            }
        }
        void Display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
        
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.InsertAtHead(5);
        li.InsertAtHead(4);

    }    
}
