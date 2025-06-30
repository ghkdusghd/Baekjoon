import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int S;
    static int[] numbers;
    static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        N = Integer.parseInt(input.nextToken());
        S = Integer.parseInt(input.nextToken());
        input = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(input.nextToken());
        }
        br.close();

        backTracking(0, 0);
        if (S == 0) result--;
        System.out.println(result);
    }

    static void backTracking(int idx, int sum) {
        if (idx == N) {
            if (sum == S) result++;
            return;
        }

        // 현재 요소를 포함하는 경우
        backTracking(idx + 1, sum + numbers[idx]);

        // 현재 요소를 포함하지 않는 경우
        backTracking(idx + 1, sum);
    }

}