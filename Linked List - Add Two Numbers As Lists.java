/* Linked List Node
struct Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node addTwoNumbers(Node l1, Node l2) {
        // your code here
        Node ans = new Node(-1);
        Node temp = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
                
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            temp.next = new Node(sum);
            temp = temp.next;
        }
        return ans.next;
    }
}
