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
    
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    private static int findIncreasingDecreasingSequence(int[] a, int size) {

        int[] b = new int[size];
        int[] c = new int[size];
        int[] bb = new int[size];
        int[] cc = new int[size];

        for (int i = 0; i < size; i++) {
            bb[i] = Integer.MAX_VALUE;
            cc[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < size; i++) {
            int lb = lowerBound(bb, a[i]);
            bb[lb] = a[i];
            b[i] = lb + 1;
        }

        for (int i = 0; i <= (size - 1) / 2; i++) {
            swap(a, i, size - 1 - i);
        }

        for (int i = 0; i < size; i++) {
            int lc = lowerBound(cc, a[i]);
            cc[lc] = a[i];
            c[i] = lc + 1;
        }

        for (int i = 0; i <= (size - 1) / 2; i++) {
            swap(c, i, size - 1 - i);
        }

        int maxSequenceLength = 0;
        for (int i = 0; i < size; i++) {
            maxSequenceLength = Math.max(maxSequenceLength, b[i] + c[i] - 1);
        }
        return maxSequenceLength;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        
        FastReader fs = new FastReader();
        
        int t = fs.nextInt();
        
        for (int i = 1; i <= t; i++) {
            
            int n = fs.nextInt();
            int[] a = new int[n];
            
            
            for (int j = 0; j < n; j++) {
                a[j] = fs.nextInt();
            }
            
            System.out.println(findIncreasingDecreasingSequence(a, n));        
            
        } 
    }
}
    
