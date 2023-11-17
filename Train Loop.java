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
		while(t!=0){
		    int n = sc.nextInt();
		    int i = 0;
		    List<Integer> l = new ArrayList <>();
		    while(i<n){
		        l.add(sc.nextInt());
		        i++;
		    }
		    Stack <Integer> stk = new Stack <>();
		    Stack <Integer> ans = new Stack <>();
		    for(i=l.size()-1;i>=0;i--){
		        if(stk.isEmpty() == true){
		            ans.push(-1);
		        }
		        else{
		            while(!stk.isEmpty() && stk.peek()>=l.get(i)){
		                stk.pop();
		            }
		            if(stk.isEmpty() == true){
		                ans.push(-1);
		            }
		            else{
		                ans.push(stk.peek());
		            }
		        }
		        stk.push(l.get(i));
		    }
		    while(!ans.isEmpty()){
		        System.out.print(ans.peek()+" ");
		        ans.pop();
		    }
		    System.out.println();
		    t--;
		}
		sc.close();
	}
}
