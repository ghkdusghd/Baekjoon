import java.util.*;

public class Main {

    static int read() throws Exception {
        int c, n = 0;
        while((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int n = read();
        int k = read();
        List<Integer>[] books = new ArrayList[11];
        for (int i = 0; i < 11; i++) books[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int price = read();
            int genre = read();
            books[genre].add(price);
        }

        int[] dp = new int[k + 1];

        for (int g = 0; g <= 10; g++) {
            List<Integer> genreList = books[g];
            if (genreList.isEmpty()) continue;

            Collections.sort(genreList, Collections.reverseOrder());
            int m = genreList.size();

            // prefix sum
            int[] prefix = new int[m + 1];
            for (int i = 0; i < m; i++) {
                prefix[i + 1] = prefix[i] + genreList.get(i);
            }

            // temp DP for this group
            int[] ndp = Arrays.copyOf(dp, dp.length);

            // i: 이 장르에서 몇 권을 고를지 (0권 ~ m권)
            for (int i = 1; i <= m; i++) {
                int total = prefix[i] + i * (i - 1);
                for (int j = k; j >= i; j--) {
                    ndp[j] = Math.max(ndp[j], dp[j - i] + total);
                }
            }
            dp = ndp;
        }
        System.out.println(dp[k]);
    }
}
