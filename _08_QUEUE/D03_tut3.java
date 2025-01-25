package _08_QUEUE;

public class D03_tut3 {
    public static void main(String[] args) {
        LL_Queue lq = new LL_Queue();
        lq.add(4);
        lq.add(5);
        lq.add(15);
        lq.add(50);
        lq.add(2);
        lq.remove();
        lq.add(10);
        lq.add(21);
        lq.remove();
        System.out.println(lq.size());
        lq.display(lq.front);
        System.out.println();
        System.out.println(lq.front.data);
        System.out.println(lq.rear.data);
        System.out.println(lq.peek());
        System.out.println(lq.isEmpty());
    }
}
