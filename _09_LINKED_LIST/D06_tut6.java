package _09_LINKED_LIST;

public class D06_tut6 {
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
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){           
                head = temp;
                tail = temp;
            }
            else{                       
                tail.next = temp;       
                tail = temp;           
            }
            size++;
        }
        int search(int key){
            Node temp  = head;
            int ind = 0;
            while(temp != null){
            if(temp.data == key){
                // System.out.println("Key found at index:"+ind);
                return ind;
            }
            temp = temp.next;
            ind++;
        }
        return -1;
    }
    //*************Search Recursivaly*************//
        int searchRec(Node head ,int key){
            Node temp  = head;
            if(temp == null){
                return -1;
            }
            if(temp.data == key){
                return 0;
            }
            int ind = searchRec(temp.next, key);
            return ind+1;
        }
        void Display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(4);
        li.insertAtEnd(5);
        li.insertAtEnd(8);
        li.insertAtEnd(9);
        li.insertAtEnd(2);
        li.insertAtEnd(1);
        li.Display();
        System.out.println("Find at:"+li.searchRec(li.head, 2));
        // System.out.println(li.head.data);
        //System.out.println("Find at index:"+li.search(1));
    }
}
