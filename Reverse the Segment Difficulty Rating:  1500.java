/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static Node reverseSegment(Node head, int L, int R){
      Node temp = head;
   int pos = 1;
   Node pre = null;
   while( temp != null ){
       if( pos == L ){
           Node temp1 = temp;
           Node pre1 = null;
           while( temp1 != null && pos <= R ){
               Node nex = temp1.next;
               temp1.next = pre1;
               pre1 = temp1;
               temp1 = nex;
               pos++;
           }
           temp.next = temp1;
           if(pre != null) {
               pre.next = pre1;
           }
           else{
               head = pre1;
           }
           break;
       }
       pre = temp;
       temp = temp.next;
       pos++;
   }
   return head;
}
