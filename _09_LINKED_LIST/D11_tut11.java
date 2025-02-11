package _09_LINKED_LIST;

public class D11_tut11 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void Display(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static boolean hasCycle(Node head) {
            Node slow = head;
            Node fast = head;
            if(head == null || head.next == null )
                return false;
            while(fast!=null){
                // if(slow == null)
                //     return false;
                slow = slow.next;
                if(fast.next == null)
                    return false;
                fast = fast.next.next;
                if(fast == slow)
                    return true;
            }
            return false;
        }
        public static int findCycleNode(Node head){
            Node slow = head;
            Node fast = head;
            if(head == null || head.next == null )
                return -1;
            while(fast!=null){
                slow = slow.next;
                if(fast.next == null)
                    return -1;
                fast = fast.next.next;
                if(fast == slow)
                    break;
            }
            Node temp = head;
            while(temp != slow){
                slow = slow.next;
                temp = temp.next;
            }
            return slow.data;
        }

    public static void main(String[] args) {
        
    }
}
