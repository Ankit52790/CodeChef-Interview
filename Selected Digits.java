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
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		while(t-- > 0){
		    int d = read.nextInt();
		    long n = read.nextLong();
		    char[] arr = new char[d];
		    for(int i=0;i<d;i++){
		        arr[i] = read.next().charAt(0);
		    }
		    solve(arr,d,n);
		}
	}
	
	public static void solve(char[] arr, int d, long n){
	    if(d==1){
	        long temp = n;
	        while(temp-->0){
	            System.out.print(arr[0]);
	        }
	        System.out.println();
	        return;
	    }
	    if(n<=d){
	        System.out.println(arr[(int)n-1]);
	        return;
	    }
	    
	    long cur = d - (arr[0]=='0' ? 1 : 0);
	    long k = n - d;
	    int len = 2;
	    while(true){
	        cur *= d;
	        if(k<=cur) break;
	        k -= cur;
	        len++;
	    }
	    String ans = "";
	    for(int i=0;i<len;i++){
	        int rem = len-i-1;
	        long t=1;
	        for(int m=0;m<rem;m++) t*=d;
	        
	        int j =0;
	        if(i==0 && arr[0]=='0') j++;
	        for(;j<d;j++){
	            if(k<=t) break;
	            k-=t;
	        }
	        ans += arr[j];
	    }
	    System.out.println(ans);
	}
}
