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

        int sum = 0; // 누적합하는 변수
        int count = 0; // 경우의 수 집계

        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum,1);
        for (int i = 1; i <= n; i++) {
            sum += read();
            count += map.getOrDefault((sum - m), 0);
            map.put(sum,1);
        }
        System.out.println(count);
    }

}
