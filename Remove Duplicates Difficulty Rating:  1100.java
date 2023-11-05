/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {
    int val;
    Node next;
    Node(int v){
        this.val = v;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   for(int k=0;k<t;k++){
	   int n = sc.nextInt();
	   int[] ar = new int[n];
	   for(int i=0;i<n;i++){
	       ar[i] = sc.nextInt();
	   }
	   Node head = new Node(ar[0]);
	   Node curr = head;
	   for(int i=1;i<n;i++){
	       curr.next = new Node(ar[i]);
	       curr =curr.next;
	   }
	   Node prev = head;
	  curr= head.next;
	   int num =head.val;
	   while(curr!=null){
	       if(curr.val == num){
	           prev.next=curr.next;
	       }
	       else{
	           prev=curr;
	           num = prev.val;
	       }
	       curr=curr.next;
	   }
	   curr= head;
	   while(curr!=null){
	       System.out.println(curr.val);
	       curr = curr.next;
	   }
	   }
	}
}
