package _08_QUEUE;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class D01_Into {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();      //Deque
        q.add(4);
        q.add(5);
        q.add(9);
        q.add(1);
        q.add(9);
        q.add(3);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.print(q.element()+" ");
            int x = q.remove();
            //push into new queue

        }
    }
}
