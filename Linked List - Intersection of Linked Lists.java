/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node n1 = head1;
         Node n2 = head2;
         
         while(n1 != n2){
             n1 = (n1 == null) ? head2 : n1.next;
             n2 = (n2 == null) ? head1 : n2.next;
         }
         
         if(n1 == null){
             return -1;
         }
         else{
            return n1.data;
         }
	}
}
