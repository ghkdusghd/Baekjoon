import java.util.Arrays;

public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args)  throws Exception {
        int N = read();
        int K = read();
        int[] bales = new int[N];
        for (int i = 0; i < N; i++) {
            bales[i] = read();
        }
        Arrays.sort(bales);

        int left = 0;
        int right = bales[N - 1];
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int x = bales[0] + mid;
            int count = 1;

            for (int i = 0; i < N; i++) {
                if ((x - mid) <= bales[i] && bales[i] <= (x + mid)) {
                    // 아무런 작업도 하지 않음
                } else {
                    x = bales[i] + mid;
                    count++;
                }
            }

            if (count > K) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid;
            }
        }

        System.out.println(result);
    }

}