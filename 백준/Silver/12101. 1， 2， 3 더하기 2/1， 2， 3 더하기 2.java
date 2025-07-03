import java.util.ArrayList;
import java.util.List;

public class Main {

    static int n;
    static int k;
    static List<String> memo;

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        n = read();
        k = read();
        memo = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            backTracking(1, i, i + "");
        }

        if (k <= memo.size()) {
            System.out.println(memo.get(k - 1));
        } else {
            System.out.println(-1);
        }
    }

    static void backTracking(int num, int cal, String result) {
        if (cal > n) return;

        if (cal == n) {
            memo.add(result);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            backTracking(i, cal + i, result + "+" + i);
        }
    }

}