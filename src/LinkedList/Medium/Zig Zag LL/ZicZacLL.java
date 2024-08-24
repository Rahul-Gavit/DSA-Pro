public class ZicZacLL {
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

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node zicZac(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        // step 1: find middle and reverse LL
        Node middle = findMiddle(head);

        Node prev = null;
        Node curr = middle;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 2: Initialize leftHead, rightHead, nextLeft and nextRight and zic zac
        // logic
        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft;
        Node nextRight;

        while (leftHead != null && rightHead != null) {

            // store left next to nextLeft
            nextLeft = leftHead.next;

            // point leftHead to rightHead
            leftHead.next = rightHead;

            // store right next to nextRight
            nextRight = rightHead.next;

            // point right next to nextLeft
            rightHead.next = nextLeft;

            // update leftHead and rightHead pointing to nextLeft and nextRight
            leftHead = nextLeft;
            rightHead = nextRight;
        }

        return head;

    }

    public void addLast(int data) {

        // Step - 1: Create a new Node
        Node newNode = new Node(data);
        size++;

        // Step - 2: Check if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Step - 3: If the list is not empty
        tail.next = newNode;

        // Step - 4: Update the tail
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZicZacLL ll = new ZicZacLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.zicZac(head);
        ll.printLL();

    }
}
