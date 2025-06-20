import java.util.*;

public class Main {

    static long read() throws Exception {
        long c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = (int)read();
        long X = read();
        long min = (X + 1) / 2;

        long[] bottles = new long[N];
        int bottleCount = 0;
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            long input = read();
            if (input >= X) {
                count++;
            } else {
                bottles[bottleCount++] = input;
            }
        }
        
        Arrays.sort(bottles, 0, bottleCount);

        int left = 0;
        int right = bottleCount - 1;
        int remain = bottleCount;

        while (left < right) {
            long sum = bottles[left] + bottles[right];
            if (sum >= min) {
                count++;
                left++;
                right--;
                remain -= 2;
            } else {
                left++;
            }
        }

        count += remain / 3;
        System.out.println(count);
    }
}