import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int val;
    Node next;
    Node( int val ){
        this.val  = val;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        
         int n = sc.nextInt();
         
         Node root = new Node( sc.nextInt() );
         
         Node cur = root;
         
         Node temp = null;
         
         for( int i = 1 ; i < n ; i++ ){
             temp = new Node(sc.nextInt());
             cur.next = temp;
             cur = temp;
         }
         
         temp = root;
         
         Node prev = null;
         
         while ( temp != null ) {
             Node temp2 = temp.next;
             temp.next = prev;
             prev = temp;
             temp = temp2;
         }
         
         root = prev;
         
         temp = root;
         
         while ( temp != null ) {
             System.out.print( temp.val + " " );
             temp = temp.next;
         }
         System.out.println();
    }
}
