// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        //Base Case: Linked List is Empty
        if (root == null){
            return 0;
        }
        
        //Pointer to the Starting and Next Node of the Linked List
        Node ptr1 = root;
        Node ptr2 = root.next;
        
        int countOfCriticalPoints = 0;
        
        while (ptr2 != null && ptr2.next != null){
            if(ptr1.val < ptr2.val && ptr2.val > ptr2.next.val) {
                //Local Maxima
                countOfCriticalPoints++;
            } else if(ptr1.val > ptr2.val && ptr2.val < ptr2.next.val) {
                //Local Minima
                countOfCriticalPoints++;
            }
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }
        
        return countOfCriticalPoints;
    }
}
