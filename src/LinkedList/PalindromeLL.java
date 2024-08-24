package LinkedList;

public class PalindromeLL {

    public static class Node {
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

    // find middle of the LL
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // find LL is palindrome or not
    public boolean checkPalindrome() {

        // Base Case: check LL is empty or only 1 element present
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: finding middle of LL
        Node middle = findMiddle(head);

        // Step 2: reverse the 2nd half
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

    public static void main(String[] args) {
        PalindromeLL list = new PalindromeLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        list.printLL();
        System.out.println(list.checkPalindrome());
    }
}
