package Queue;

import java.util.*;

public class Deck {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(56);
        deque.add(34);
        deque.addFirst(33);
        deque.addLast(78);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);

    }
}
