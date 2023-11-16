/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ListNode{
    int value;
    ListNode child, next;
    
    ListNode(int value){
        this.value = value;
        this.child = this.next = null;
    }
}
class StrangeLinkedList
{
    public static boolean checkNodeExist(ListNode array[], int index){
        return array[index] == null ? false : true;
    }
    public static void printStrangeLinkedList(ListNode headNode){
        if(headNode == null){
            return;
        }
        System.out.print(headNode.value + " ");
        
        printStrangeLinkedList(headNode.child);
        printStrangeLinkedList(headNode.next);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int number = s.nextInt();
		    ListNode listNodeArray[] = new ListNode[number+1];
		    while(--number != 0){
		        int first = s.nextInt();
		        int second = s.nextInt();
		        int type = s.nextInt();
		        
		        if(!checkNodeExist(listNodeArray, first)){
		            ListNode node1= new ListNode(first);
		            listNodeArray[first] = node1;
		        }
		        
		        if(!checkNodeExist(listNodeArray, second)){
		            ListNode node2 = new ListNode(second);
		            listNodeArray[second] = node2;
		        }
		        
		        if(type == 1){
		            listNodeArray[first].child = listNodeArray[second];
		            
		        }
		        else{
		            listNodeArray[first].next = listNodeArray[second];
		        }
		    }
		    printStrangeLinkedList(listNodeArray[1]);
		}
	}
}
