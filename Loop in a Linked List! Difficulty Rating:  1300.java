// class Node{
//     int val;
//     Node next;
//     Node(){
//         val =0;
//         next = null;
//     }
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        // return -1 if no loop exists else return length of the loop
      Node r = null;
      Node h = root;
      Node h1 = root.next;
      Node x =root;
      while(h1!=h){
          if(h1==null || h1.next==null) {
              return -1;
          }
          h1=h1.next.next;
          h=h.next;
      }
        int res = 1;
        Node temp = h;
        while (temp.next != h) {
            res++;
            temp = temp.next;
        }
        return res;
    //  Node slow_p = list, fast_p = list;
    //     while (slow_p != null && fast_p != null
    //           && fast_p.next != null) {
    //         slow_p = slow_p.next;
    //         fast_p = fast_p.next.next;
 
    //         /* If slow_p and fast_p meet at some point
    //         then there is a loop */
    //         if (slow_p == fast_p)
    //             return countNodes(slow_p);
    //     }
 
    //     /* Return 0 to indicate that there is no loop*/
    //     return -1;
    }
     static int countNodes(Node n)
    {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }
}
