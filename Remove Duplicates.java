/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int value;
    Node next;
    
    public Node(int value){
        this.value = value;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0;i<t;i++){
           String response = "";
           int len = sc.nextInt();
           int[] ar = new int[len];
           for(int j=0;j<len;j++){
               ar[j] = sc.nextInt();
           }
           Node head = new Node(ar[0]);
           Node curr = head;
           for (int k=1; k<len; k++){
               Node next = new Node(ar[k]);
               if (next.value != curr.value){
                    curr.next = next;
                    if (response == "") response = String.valueOf(curr.value);
                    else response += (" " + String.valueOf(curr.value));
                    curr = next;
                    
               }
            }
            if (response == "") response = String.valueOf(curr.value);
            else response += (" " + String.valueOf(curr.value));
           System.out.println(response);
       }
	}
}
