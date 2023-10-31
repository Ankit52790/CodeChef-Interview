/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();// no. of astroids
            int dir[] = new int[n];// direction array
            long power[] = new long[n];// astriod size or power array

            for (int i = 0; i < n; i++) {
                dir[i] = scn.nextInt();
                power[i] = scn.nextLong();
            }

            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                // if direction is right
                if (dir[i] == 1) {
                    stack.push(i);// if the astriod is in right direction then we will maintain a stack of right's
                                  // direction array and when we will see a left astriod array we will hit it
                } else {
                    // time to hit (means direction is left)
                    while (!stack.isEmpty() && power[stack.peek()] < power[i]) {// we will all hit astriods with each
                                                                                // other while our adjancent astriod
                                                                                // right astriod that is in stack peek
                                                                                // is smaller then left side astriod
                        power[i] += power[stack.peek()];
                        stack.pop();
                    }
                    if (!stack.isEmpty()) {// us stack has elements it means we have the element of same size or we have
                                           // element that cannont collide or left side astriod is greater then right
                                           // side astriod

                        // case 1 if both are of same size
                        if (power[stack.peek()] == power[i]) {
                            stack.pop();
                        } // case 2 if is of greater size
                        else {
                            power[stack.peek()] += power[i];
                        }
                    } else {
                        // is stack is empty means no anstriod adjancent to hit
                        arr.add(i);
                    }
                }

            }
            while (!stack.isEmpty()) {
                arr.add(stack.pop());
            }
            Collections.sort(arr);// for prtinting in increasing order
            System.out.println(arr.size());
            if (arr.size() > 0)
                for (int i : arr) {
                    System.out.print(i + 1 + " ");
                }

        }
    }
}
