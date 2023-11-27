import java.util.Scanner;

class smallestjquery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        long[] A = new long[N + 1];
        A[0] = 0;

        for (int i = 1; i <= N; i++) {
            A[i] = A[i - 1] + scanner.nextLong();
        }

        for (int q = 0; q < Q; q++) {
            int i = scanner.nextInt();
            long x = scanner.nextLong();

            int low = i;
            int high = N;
            int result = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                long sum = A[mid] - A[i - 1];

                if (sum >= x) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
