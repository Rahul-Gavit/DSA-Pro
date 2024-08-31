package Queue;

public class QueueLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static class Queue {

        // empty case
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add element
        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null && tail == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
