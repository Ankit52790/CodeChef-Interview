/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int size = 0;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node create(Node head,int[] a){
        int i;
        Node temp = null;
        for(i=0;i<a.length;i++){
            Node node = new Node(a[i]);
            if(head == null){
                head = temp = node;
            }
            else{
                temp.next = node;
                temp = node;
            }
            size++;
        }
        return head;
    }
    public static Node insert(Node head,int pos,int ele){
        pos--;
        Node node = new Node(ele);
        if(pos == 0 || head == null){
            size++;
            node.next = head;
            return node;
        }
        Node temp = head;
        if(pos>size){
            size++;
            while(temp.next!=null){
                temp = temp.next;
            }  
            temp.next = node;
            return node;
        }
        size++;
        int i=0;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        Node t = temp.next;
        temp.next = node;
        node.next = t;
        return head;
    }
    public static Node delete(Node head,int pos){
        pos--;
        if(head == null || pos>=size){
            return head;
        }
        size--;
        if(pos == 0){
            return head.next;
        }
        int i = 0;
        Node temp = head;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		int i = 0;
		Node head = null;
		while(n!=0){
		    a[i++] = sc.nextInt();
		    n--;
		}
		head = create(head,a);
		while(q!=0){
		    int p = sc.nextInt();
		    if(p == 0){
		        head = delete(head,sc.nextInt());
		    }
		    else{
		        int pos = sc.nextInt();
		        int ele = sc.nextInt();
		        head = insert(head,pos,ele);
		    }
		    Node temp = head;
		    while(temp!=null){
		        System.out.print(temp.data+" ");
		        temp = temp.next;
		    }
		    System.out.println();
		    q--;
		}
		sc.close();
	}
}
