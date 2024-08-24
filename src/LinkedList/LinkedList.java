package LinkedList;

public class LinkedList {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 1;

        while (i != idx) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next.next;
        temp.next = newNode;

    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        size--;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {

        // empty list or 1 node present
        if (head == null || head.next == null) {
            return true;
        }
        // middle of LL
        Node middle = findMiddle(head);

        // reverse LL
        Node prev = null;
        Node curr = middle;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

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

    public Node removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(12);
        // ll.addFirst(11);
        // ll.addLast(22);
        // ll.addLast(23);
        // ll.printLL();
        // ll.add(2, 30);
        // ll.removeFirst();
        // ll.removeLast();cls

        // ll.printLL();

        head = ll.new Node(12);
        head.next = ll.new Node(13);
        head.next.next = ll.new Node(14);
        head.next.next.next = ll.new Node(15);
        head.next.next.next.next = ll.head;

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.printLL();
        System.out.println(ll.detectCycle());
        ll.removeCycle();
        ll.printLL();
    }
}