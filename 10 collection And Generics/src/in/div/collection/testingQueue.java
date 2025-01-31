package in.div.collection;

import java.util.LinkedList;
import java.util.Queue;

public class testingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1 );
        queue.offer(2 );
        utility.print(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        utility.print(queue);
        System.out.println(queue.poll());
        utility.print(queue);
        System.out.println(queue.poll());
    }
}
