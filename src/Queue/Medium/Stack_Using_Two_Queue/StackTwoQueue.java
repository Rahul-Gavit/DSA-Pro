package Queue.Medium.Stack_Using_Two_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackTwoQueue {

    public static class StackUsingTwoQueues {
        // Two queues
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // Push operation
        public void push(int data) {
            // Push the new element to queue2
            queue2.add(data);

            // Transfer all elements from queue1 to queue2
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }

            // Swap the names of queue1 and queue2
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        // Pop operation
        public int pop() {
            // If queue1 is empty, stack is empty
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // The front of queue1 is the top of the stack
            return queue1.remove();
        }

        // Peek operation
        public int top() {
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // The front of queue1 is the top of the stack
            return queue1.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return queue1.isEmpty();
        }
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Top element after pop: " + stack.top()); // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }

}
