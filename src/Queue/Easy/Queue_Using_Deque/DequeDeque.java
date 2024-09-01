package Queue.Easy.Queue_Using_Deque;

import java.util.*;

public class DequeDeque {

    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeFirst();
        }

        public int peek() {
            return dq.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek());
    }
}
