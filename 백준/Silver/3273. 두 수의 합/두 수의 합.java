import java.util.*;

public class Main {

    static int read() throws Exception {
        int n = 0, c = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int n = read();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = read();
        }
        int x = read();

        int count = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            count += memo.getOrDefault(x - A[i], 0);
            memo.put(A[i], 1);
        }
        System.out.println(count);
    }

}
