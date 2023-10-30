/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static boolean isDistinct( String s ){
        
        HashSet<Character> set = new HashSet<>();
        
        for( int i = 0 ; i < s.length() ; i++ ){
            
            if( set.contains(s.charAt(i)) ) return false;
            else set.add( s.charAt(i) );
        }
        
        return true;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int x = sc.nextInt();
		    
		    x++;
		    
		    while( !isDistinct( String.valueOf( x ) ) ){
		        
		        x++;
		        
		    }
		    
		    System.out.println( x );
		    
		}
	}
}
