import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int K;
    static char[] signs;
    static boolean[] visit = new boolean[10];
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        signs = new char[K];
        for (int i = 0; i < K; i++) {
            signs[i] = st.nextToken().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            visit[i] = true;
            backTracking(i, 0, i+"");
            visit[i] = false;
        }

        System.out.println(result.get(result.size() - 1));
        System.out.println(result.get(0));
    }

    static void backTracking(int now, int count, String number) {
        if (count == K) {
            result.add(number);
            return;
        }

        for (int next = 0; next < 10; next++) {
            if (visit[next] == false) {
                if ((signs[count] == '<' && now < next) || (signs[count] == '>' && now > next)) {
                    visit[next] = true;
                    backTracking(next, count + 1, number + next);
                    visit[next] = false;
                }
            }
        }
    }

}