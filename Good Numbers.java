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
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    
		    Set<Integer> list = new TreeSet<Integer>();
		    for(int i = 1; i<= n; i++){
		        list.add(a*i);
		        list.add(b*i);
		        list.add(c*i);
		    }
		    List<Integer> list2 = new ArrayList<Integer>();
		    list2.addAll(list);
		    
		    Collections.sort(list2);
		    System.out.println(list2.get(n-1));
		    
		}
	}
}
