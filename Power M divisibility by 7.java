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
		int t=sc.nextInt();
		while(t-- >0)
		{
		    long n=sc.nextLong();
		    long m=sc.nextLong();
		    long num=0;
		    double power=m%4;
		    if(power==0 && m!=0)
		        power = 4;
		    while(n!=0)
		    {
		        int digit = (int) Math.pow(n%10,power);
		        digit = digit%10;
		        num=num*10+digit;
		        n=n/10;
		    }
		    if(num%7==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    
		}
	}
}
