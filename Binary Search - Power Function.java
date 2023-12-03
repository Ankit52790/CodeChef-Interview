/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long pow( long n , long x , long m ){
        
        long ans = 1;
        
        while( x > 0 ){
            
            if( (x & 1) == 1 ){
                ans *= n;
                ans %= m;
            }
            
            n = n * n;
            
            n %= m;
            
            x = ( x >> 1 );
            
        }
        
        return ans;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in) ;
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    long n = sc.nextLong();
		    long x = sc.nextLong();
		    long m = sc.nextLong();
		    
		    System.out.println( pow( n ,x ,m ) );
		    
		}
	}
}
