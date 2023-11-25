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
		    int m = s.nextInt();
		    
		    HashSet<Integer> set = new HashSet<>();
		    for(int i =0; i < n; i++){
		        set.add(s.nextInt());
		    }
		    for(int i = 0; i < m; i++){
		        if(set.contains(s.nextInt()) == true){
		            System.out.print("Yes ");
		        }
		        else{
		            System.out.print("No ");
		        }
		    }
		    System.out.println();
		}
	}
}
