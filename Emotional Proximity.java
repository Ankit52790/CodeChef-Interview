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
		double t,p,x,y,z;
		double result;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    p=sc.nextDouble();
		    x=sc.nextDouble();
		    y=sc.nextDouble();
		    z=sc.nextDouble();
		    if(z==1)
		    {
		        result=p+(p*y/100.0);
		    }
		    else
		    {
		        result=p-(p*x/100.0);
		    }
		    System.out.println(result);
		}
	}
}
