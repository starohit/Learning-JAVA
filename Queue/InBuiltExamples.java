package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(38);
        queue.add(45);
        queue.add(37);
        queue.add(36);
        queue.add(43);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
