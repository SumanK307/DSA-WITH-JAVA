package _09_LINKED_LIST;

import java.util.*;

public class D02_tut2 {
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
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null){           // for empty list
            head = temp;
            tail = temp;
        }
        else{                       // for available list
            tail.next = temp;       // present tail ko temp se connect karega
            tail = temp;            // tail new value ko bana dega
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
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
    }
}
