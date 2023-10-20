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
		int t = sc.nextInt();
		while(t>0){
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long c = sc.nextLong();
		    if((a+b)==c){
		        System.out.println("Yes");
		    }else if((a+c)==b){
		        System.out.println("Yes");
		    }else if((b+c)==a){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
