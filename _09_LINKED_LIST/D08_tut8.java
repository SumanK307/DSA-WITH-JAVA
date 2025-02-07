package _09_LINKED_LIST;

public class D08_tut8 {
    // LC Question-no(19)-> find nth nde from end
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");  
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
        //******************Remove nth Node from end(Turtle rabit technique) */
        Node removeNthNode(Node head , int n){
            Node fast = head;
            Node slow = head;
            for (int j = 1; j <= n; j++){
                fast = fast.next;
            }
            if(fast == null){
                head = head.next;
                return head;
            }
            while (fast.next!=null){ 
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(6);
        li.insertAtEnd(2);
        li.insertAtEnd(4);
        li.insertAtEnd(1);
        li.insertAtEnd(9);
        li.insertAtEnd(7);
        li.insertAtEnd(5);
        li.insertAtEnd(9);
        System.out.println("Original LL:");
        li.Display(li.head);
                // Node tem = li.nthNode(li.head, 3); 
                //Node tem2 = li.nthNode2(li.head, 3); 
                System.out.println(); 
                //System.out.println(tem2.data);
                // Node te = li.removeNthNode(li.head, 3);
                // li.Display(te);
                // li.head = te;
                // System.out.println(li.head.data);
    }
}
