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
    
    
    private static String isItThere(int[] A, int N, int x) {
        
        int start = 0;
        int end = N - 1;
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (x == A[mid]) {
                return "Found";
            } else if (x < A[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return "Not Found";
    }
    
  
    public static void main(String[] args) {
        
        FastReader fs = new FastReader();
        
        int t = fs.nextInt();
        
        for (int i = 1; i <= t; i++) {
            
            int n = fs.nextInt();
            int q = fs.nextInt();
            int[] in = new int[n];
            
            for (int j = 0; j < n; j++) {
                in[j] = fs.nextInt();
            }
            
            for (int j = 0; j < q; j++) {
                int x = fs.nextInt();
                String ans = isItThere(in, n, x);
                System.out.println(ans);
            }
        } 
    }
}
    
