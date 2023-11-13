import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Codechef {

    public static Node reverseMSizeGroups(Node head, int M) {
        if (head == null || M <= 1)
            return head;

        Node current = head;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            Node groupHead = null;
            Node groupTail = null;
            int count = 0;

            while (current != null && count < M) {
                Node nextNode = current.next;
                current.next = groupHead;
                groupHead = current;

                if (groupTail == null)
                    groupTail = current;

                current = nextNode;
                count++;
            }

            if (prevTail != null)
                prevTail.next = groupHead;

            prevTail = groupTail;

            if (newHead == null)
                newHead = groupHead;
        }

        return newHead;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Length of the linked list
            int M = scanner.nextInt(); // Group size
            Node head = null;
            Node tail = null;

            for (int i = 0; i < N; i++) {
                int data = scanner.nextInt(); // Elements of the linked list
                Node newNode = new Node(data);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            Node newHead = reverseMSizeGroups(head, M);
            printList(newHead);
        }
    }
}
