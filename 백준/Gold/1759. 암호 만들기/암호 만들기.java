import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int L;
    static int C;
    static String[] alphabet;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        L = Integer.parseInt(input.nextToken());
        C = Integer.parseInt(input.nextToken());
        visit  = new boolean[C];
        sb = new StringBuilder();
        alphabet = br.readLine().split(" ");
        Arrays.sort(alphabet);
        br.close();

        for (int i = 0; i < C; i++) {
            visit[i] = true;
            backTracking(i,1, alphabet[i]);
            visit[i] = false;
        }

        System.out.println(sb);
    }

    static void backTracking(int idx, int count, String str) {
        if (count == L) {
            int vo = 0, co = 0;
            for (int i = 0; i < L; i++) {
                char check = str.charAt(i);
                if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                    vo++;
                } else {
                    co++;
                }
            }
            if (vo >= 1 && co >= 2) {
                sb.append(str).append("\n");
            }
            return;
        }

        for (int next = 0; next < C; next++) {
            if (next >= idx) {
                if (visit[next] == false) {
                    visit[next] = true;
                    String result = str + alphabet[next];
                    backTracking(next,count + 1, result);
                    visit[next] = false;
                }
            }
        }
    }

}