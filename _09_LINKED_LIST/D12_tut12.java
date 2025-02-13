package _09_LINKED_LIST;

public class D12_tut12{
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

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) { // for empty list
                head = temp;
                tail = temp;
            } else { // for available list
                tail.next = temp; // present tail ko temp se connect karega
                tail = temp; // tail new value ko bana dega
            }
            size++;
        }

        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    // Using Extra space 
    Node Merge(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if (temp1.data > temp2.data) {
                Node tem = new Node(temp2.data);
                 temp.next = tem;
                 temp = tem;
                 temp2 = temp2.next;
            } 
            else{
                Node tem = new Node(temp1.data);
                temp.next = tem;
                temp = tem;
                temp1 = temp1.next;
            }
        }
        if(temp1 == null)
            temp.next = temp2;
        else
            temp.next = temp1;
        return head.next;
    }
    //Without using extra space
    Node Merge2(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if (temp1.data > temp2.data) {
                //Node tem = new Node(temp2.data);
                 temp.next = temp2;
                 temp = temp2;
                 temp2 = temp2.next;
            } 
            else{
                //Node tem = new Node(temp1.data);
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
        }
        if(temp1 == null)
            temp.next = temp2;
        else
            temp.next = temp1;
        return head.next;
    }
}

    public static void main(String[] args) {
        LinkedList li1 = new LinkedList();
        LinkedList li2 = new LinkedList();
        LinkedList li = new LinkedList();
        li1.insertAtEnd(1);
        li1.insertAtEnd(3);
        li1.insertAtEnd(5);
        li1.insertAtEnd(7);
        li1.insertAtEnd(9);
        System.out.print("LL1: ");
        li1.Display(li1.head);
        li2.insertAtEnd(2);
        li2.insertAtEnd(4);
        li2.insertAtEnd(6);
        li2.insertAtEnd(8);
        li2.insertAtEnd(10);
        System.out.print("LL2: ");
        li2.Display(li2.head);
        System.out.print("Sorted Array:");
        li.Display(li.Merge(li1.head, li2.head));
        System.out.println("Head1:"+li1.head.data);
        System.out.println("tail1:"+li1.tail.data);
        System.out.println("size1:"+li1.size);
        // System.out.println("Head2:"+li2.head.data);
        // System.out.println("tail2:"+li2.tail.data);

        // System.out.println("size2:"+li2.size);
        // System.out.println("Head:"+li.head.data);
        // System.out.println("tail:"+li.tail.data);
        // System.out.println("size:"+li.size);
        li.Display(li.Merge2(li1.head, li2.head));
    }
}