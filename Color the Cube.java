/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    long n=s.nextLong();
		    long x1=s.nextLong();
		    long x2=s.nextLong();
		    long x3=s.nextLong();
		    long x4=s.nextLong();
		    long x5=s.nextLong();
		    long x6=s.nextLong();
		    long cost=0;
		    if(n%2==0){
		       cost=(x1+x2+x3+x4+x5+x6)*n/2;
		    }
		    else{
		        cost=(x1+x2+x3+x4+x5+x6)*(n+1)/2;
		    }
		    
		    System.out.println(cost);
		}
	}
}
