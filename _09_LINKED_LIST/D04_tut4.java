package _09_LINKED_LIST;


public class D04_tut4 {
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

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " " + temp);  // temp -> print address
                temp = temp.next;
            }
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
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){           
                head = temp;
                tail = temp;
            }
            else{                       
                temp.next = head;       
                head = temp;            
            }
            size++;
        }
        void insertAtInd(int val, int ind) {
            Node temp = new Node(val);
            Node var = head;
            if (ind == size) {
                insertAtEnd(val);
                return;
            }
            else if(ind == 0){
                insertAtHead(val);
                return;
            } 
            for (int i = 1; i <= ind - 1; i++) {
                var = var.next;
            }
            temp.next = var.next;
            var.next = temp;
            size++;
        }
        int getIndVal(int ind){
            Node temp = head;
            for (int i = 1; i <= ind; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
        li.insertAtEnd(6);
        li.insertAtEnd(1);
        li.insertAtInd(9, 3);
        li.Display();
        System.out.println("LL tail value is:"+ li.tail.data);
        System.out.println("LL head value is:"+ li.head.data);
        // System.out.println("at index value is:"+li.getIndVal(3));
        System.out.println("LL Size is:"+ li.size);
        li.Display();
        System.out.println("LL Size is:"+ li.size);
        System.out.println("LL tail value is:"+ li.tail.data);
        System.out.println("LL head value is:"+li.head.data);
    }    
}
