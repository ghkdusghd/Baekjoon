
public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        int K = read();
        long[] kettles = new long[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            int input = read();
            kettles[i] = input;
            max = Math.max(max, input);
        }

        long left = 1;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < N; i++) {
                count += kettles[i] / mid;
            }
            if (count >= K) {
                left = mid + 1;
                result = mid;
            } else if (count < K) {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }

}