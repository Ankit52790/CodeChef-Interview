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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int[] arra = new int[a];
		    int[] arrb = new int[b];
		    int[] arrc = new int[c];
		    
		    
		    HashMap<Integer, Integer> map1 = new HashMap<>();
		    HashMap<Integer, Integer> map2 = new HashMap<>();
		    HashMap<Integer, Integer> map3 = new HashMap<>();
		    
		    for(int i = 0; i < a; i++){
		        arra[i] = s.nextInt();
		        if(map1.containsKey(arra[i]) == true){
		            map1.put(arra[i], map1.get(arra[i])+1);
		        }
		        else{
		            map1.put(arra[i],1);
		        }
		    }
		    for(int i = 0; i < b; i++){
		        arrb[i] = s.nextInt();
		        if(map2.containsKey(arrb[i]) == true){
		            map2.put(arrb[i], map2.get(arrb[i])+1);
		        }
		        else{
		            map2.put(arrb[i],1);
		        }
		    }
		    for(int i = 0; i < c; i++){
		        arrc[i] = s.nextInt();
		        if(map3.containsKey(arrc[i]) == true){
		            map3.put(arrc[i], map3.get(arrc[i])+1);
		        }
		        else{
		            map3.put(arrc[i],1);
		        }
		    }
		    int count = 0;
		    for(Integer k : map1.keySet()){
		        if(map2.containsKey(k) == true && map3.containsKey(k) == true){
		            int min = Math.min(map2.get(k), map3.get(k));
		            count += Math.min(map1.get(k), min);
		        }
		    }
		    System.out.println(count);
		}
	}
}
