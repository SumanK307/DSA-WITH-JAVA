package _09_LINKED_LIST;

public class D10_tut10 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        //LC Question-no(876)-> find middle node in LL

        int middle(Node head){
            Node slow = head;
            Node fast = head;
            //while( fast.next.next != null )           //for even no node(left node)  
            while( fast != null && fast.next != null)   //even no(right node) && for odd no
            {
                slow = slow.next;
                fast = fast.next.next;
            } 
            return slow.data;
        }
    //LC Question-no(2095)-> delete middle node in LL
    
        void middleDelete(Node head){
            Node slow = head;
            Node fast = head;
            // if(head.next == null)        //empty node
            //     return null;

            //while(fast.next.next.next.next != null )                  //for even no node(left node) 
            while(fast.next.next != null && fast.next.next.next != null)//even no(right node) && for odd no  
            {
                slow = slow.next;
                fast = fast.next.next;
            } 
            slow.next = slow.next.next;
        }
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
            li.insertAtEnd(4);
            li.insertAtEnd(5);
            li.insertAtEnd(8);
            li.insertAtEnd(9);
            li.insertAtEnd(2);
            li.insertAtEnd(11);
            li.Display(li.head);
            System.out.println("Middle is:"+li.middle(li.head)); 
            li.middleDelete(li.head); 
            li.Display(li.head);
            System.out.println("Head:"+li.head.data);
            System.out.println("tail:"+li.tail.data);
            System.out.println("size:"+li.size);
    }
}


