package _08_QUEUE;
import java.util.*;

public class D02_tut2 {

    public static void main(String[] args) {
        ArrQueue aq = new ArrQueue();
        aq.add(6);
        aq.add(61);
        aq.add(60);
        aq.add(2);
        System.out.println(aq.peek());
        aq.remove();
        System.out.println(aq.peek());
        System.out.println(aq.size());
        aq.display();
        System.out.println();
        aq.add(5);
        aq.add(5);
        aq.remove();
        aq.add(5);
        System.out.println(aq.peek());
        System.out.println("r"+aq.rear);
        System.out.println("f"+aq.front);
        System.out.println(aq.peek());
        System.out.println(aq.size());
        System.out.println(aq.arr.length);
        aq.display();
    }
}
