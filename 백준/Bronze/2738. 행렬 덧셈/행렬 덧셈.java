import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] ary = new int[N][M];

        // 행렬 1
        int i = 0;
        while (i < N) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ary[i][j] += Integer.parseInt(st.nextToken());
            }
            i++;
        }

        // 행렬 2
        i = 0;
        while (i < N) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ary[i][j] += Integer.parseInt(st.nextToken());
            }
            i++;
        }

        // 출력
        for (i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(ary[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
