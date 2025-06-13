import java.util.*;

public class Main {

    static int read() throws Exception {
        int c, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int n = read();
        int m = read();
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i-1] + read();
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 1; i <= n; i++) {
            count += map.getOrDefault((prefix[i] - m), 0);
            map.put(prefix[i],1);
        }
        System.out.println(count);
    }

}
