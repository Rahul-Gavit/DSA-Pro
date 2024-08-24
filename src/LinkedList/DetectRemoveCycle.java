package LinkedList;

public class DetectRemoveCycle {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle
        }

        // Find the start of the cycle
        slow = head;
        Node prev = null;

        if (slow == fast) { // Special case when the cycle starts at the head
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle by setting the node before the start of the cycle to point
        // to null
        prev.next = null;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DetectRemoveCycle ll = new DetectRemoveCycle();
        head = ll.new Node(12);
        head.next = ll.new Node(13);
        head.next.next = ll.new Node(14);
        head.next.next.next = ll.new Node(15);
        head.next.next.next.next = head.next.next; // Create a cycle

        System.out.println("Cycle detected: " + ll.detectCycle());
        ll.removeCycle();
        System.out.println("Cycle detected after removal: " + ll.detectCycle());
        ll.printLL();
    }
}
