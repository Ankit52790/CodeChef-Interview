/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


class PairWiseSwap {
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node dummy = new Node(-1);
        Node ans = dummy;
        dummy.next = head;
        while(dummy.next != null && dummy.next.next != null){
            Node a = dummy.next;
            Node b = dummy.next.next;
            Node c = dummy.next.next.next;
            dummy.next = b;
            dummy.next.next = a;
            dummy.next.next.next = c;
            dummy = dummy.next.next;
        }
        return ans.next;
    }
}
