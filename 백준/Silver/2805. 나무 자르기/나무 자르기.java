
public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        int M = read();
        int[] trees = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            int input = read();
            trees[i] = input;
            max = Math.max(input, max);
        }

        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            long sum = 0;
            int mid = (left + right) / 2;
            for (int i = 0; i < N; i++) {
                if (trees[i] >= mid) {
                    sum += trees[i] - mid;
                }
            }
            if (sum >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }

}