/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner av=new Scanner(System.in);
		int a=av.nextInt();
		while(a-->0){
		    int b=av.nextInt();
		    Node newnode=new Node(-1);
		    newnode.next=new Node(av.nextInt());
		    Node temp=newnode.next;
		for(int i=1;i<b;i++){
		    temp.next=new Node(av.nextInt());
		    temp=temp.next;
		}
		temp=newnode.next;
		Node prev=newnode;
		while(temp!=null && temp.next!=null){
		    boolean flag=false;
		    while(temp.next!=null && temp.data==temp.next.data){
		        temp=temp.next;
		        flag=true;
		    }
		    if(flag){
		        prev.next=temp.next;
		    }
		    else{
		        prev=temp;
		    }
		    temp=temp.next;
		}
		newnode=newnode.next;
		while(newnode!=null){
		    System.out.print(newnode.data+" ");
		    newnode=newnode.next;
		}
		System.out.println();
		}
		
	}
}
