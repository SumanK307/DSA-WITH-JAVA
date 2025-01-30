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
        b.next = c;
        c.next = d;
        d.next = e; 
    // For printting data 
        System.out.println(a.data);             //3
        System.out.println(a.next.data);        //5
        System.out.println(a.next.next.data);   //6

    // for printitng data by for loop(when no of node is given)
        System.out.println("Print through Loop");
        Node temp = a;
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
    //*****************************// for printitng data by for loop(when no of node not given)
    System.out.println("Print through While(Always use)");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    System.out.println("\nPrint through function:");
    Display(a);
    System.out.println("\nPrint through recursion:");
    Display2(a);
    }
}
