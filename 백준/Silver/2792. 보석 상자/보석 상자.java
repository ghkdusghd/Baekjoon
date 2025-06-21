import java.util.*;

public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        int M = read();
        int[] jewels = new int[M];
        int max = 0;
        for (int i = 0; i < M; i++) {
            int input = read();
            max = Math.max(max, input);
            jewels[i] = input;
        }

        int left = 1;
        int right = max;
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < M; i++) {
                if (jewels[i] % mid == 0) {
                    count += jewels[i] / mid;
                } else {
                    count += jewels[i] / mid + 1;
                }
            }

            if (count > N) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid;
            }
        }
        System.out.println(result);
    }

}