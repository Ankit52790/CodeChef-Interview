/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    ArrayList<Integer>even = new ArrayList<>();
		    ArrayList<Integer>odd = new ArrayList<>();
		    ArrayList<Integer>main = new ArrayList<>();
		    int n = sc.nextInt();
		    for(int i=0;i<n;i++){
		        int data = sc.nextInt();
		        main.add(data);
		    }
		    for(int num:main){
		        if(num%2==0){
		            even.add(num);
		        }
		        else{
		            odd.add(num);
		        }
		    }
		    even.addAll(odd);
		    for(int num:even){
		        System.out.print(num+" ");
		    }
		}
	}
}
