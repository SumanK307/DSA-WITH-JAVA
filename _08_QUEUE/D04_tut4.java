package _08_QUEUE;

public class D04_tut4 {

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.add(9);
        cq.add(10);
        // System.out.println("r"+cq.rear);
        // System.out.println("f"+cq.front);
        // System.out.println("s"+cq.size());
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.display();
        cq.add(11);
        cq.add(21);
        cq.add(31);
        cq.display();
        // cq.remove();
        // cq.remove();
        System.out.println("f"+cq.front);
        System.out.println("r"+cq.rear);
        System.out.println("s"+cq.size());
        System.out.println(cq.peek());
        System.out.println();
        cq.remove();
        cq.remove();
        //cq.display();
        // cq.add(11);
        cq.add(22);
        cq.add(33);
        cq.add(34);
        cq.remove();
        System.out.println("r"+cq.rear);
        System.out.println("f"+cq.front);
        System.out.println("s"+cq.size());
        cq.display();
        System.out.println("r"+cq.rear);
        System.out.println("f"+cq.front);
        System.out.println("s"+cq.size());
        System.out.println(cq.peek());
        
    }
}
