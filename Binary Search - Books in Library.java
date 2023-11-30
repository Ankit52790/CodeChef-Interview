/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
static long getSum( int [] a ){
        long sum = 0;
        for( int e :  a) sum += e;
        return sum;
    }
    
    static long getMax( int [] a ){
         long max = 0;
         for( int e :  a) max = Math.max( max , e );
        return max;
        
    }
     static boolean isValid( long mid , int k , int[] a ){
        long sum = 0;
        int stu = 1;
            for( int i = 0 ; i < a.length ; i++ ){
            if( sum + a[i] > mid ){
                
                stu++;
                sum = a[i];
             }
            else{
                 sum += a[i];
             }
            
        }
        return stu <= k;
         }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		    
		    long min = getMax( a );
		    
		    long max = getSum( a );
		    
		    long ans = 0;
		    
		    while( min <= max ){
		        
		        long mid = min + ( ( max - min ) / 2 );
		        
		        if( isValid( mid , k , a ) ){
		            ans = mid;
		            max = mid - 1;
		        }
		        else{
		            min = mid + 1;
		        }
		        
		    }
		    
		    System.out.println( ans );
	}
}
}
