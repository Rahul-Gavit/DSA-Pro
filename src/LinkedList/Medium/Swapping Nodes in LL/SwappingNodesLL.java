public class SwappingNodesLL {

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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public Node swapNodes(Node head, int k) {
        if (head == null || head.next == null) {
            return head; // Corner case: list is empty or has only one node
        }

        Node first = head;
        Node second = head;
        Node kthFromBegin = null;

        // Find the k-th node from the beginning
        for (int i = 1; i < k; i++) {
            if (first != null) {
                first = first.next;
            }
        }

        kthFromBegin = first;

        // Move both first to end and second to (n-k+1)th from the beginning
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        // At this point, `second` is at the k-th node from the end
        // Swap the values of `kthFromBegin` and `second`
        int temp = kthFromBegin.data;
        kthFromBegin.data = second.data;
        second.data = temp;

        return head;
    }

    public static void main(String[] args) {
        SwappingNodesLL list1 = new SwappingNodesLL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        int k = 2;
        list1.printLL();
        list1.swapNodes(head, k);
        list1.printLL();

    }

}
