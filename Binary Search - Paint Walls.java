import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    private static long findMinimumTime(int[] walls, int n, int painters, int timeToPaint) {

        long firstWall = 0;
        long lastWall = 0;

        for (int work = 0; work < n; work++) {
            lastWall += (long) walls[work] * timeToPaint;
            firstWall = Math.max(firstWall, (long) walls[work] * timeToPaint);
        }

        while (firstWall < lastWall) {

            long midWall = firstWall + (lastWall - firstWall) / 2;
            long requiredPainters = getNumberOfPainters(walls, n, midWall, timeToPaint);

            if (requiredPainters <= painters) {
                lastWall = midWall;
            } else {
                firstWall = midWall + 1;
            }
        }
        return firstWall;
    }

    private static long getNumberOfPainters(int[] walls, int n, long maxTime, int timeToPaint) {

        int totalPainters = 1;
        long currentWork = 0;

        for (int work = 0; work < n; work++) {
            currentWork += (long) walls[work] * timeToPaint;

            if (currentWork > maxTime) {
                totalPainters++;
                currentWork = (long) walls[work] * timeToPaint;
            }
        }
        return totalPainters;
    }
    
    
    public static void main(String[] args) {
        
        FastReader fs = new FastReader();
        
        int t = fs.nextInt();
        
        for (int i = 1; i <= t; i++) {
            
            int n = fs.nextInt();
            int painters = fs.nextInt();
            int timeToPaint = fs.nextInt();
            
            int[] walls = new int[n];
            
            for (int in = 0; in < n; in++) {
                walls[in] = fs.nextInt();
            }
            System.out.println(findMinimumTime(walls, n, painters, timeToPaint));
            
        } 
    }
}
    
