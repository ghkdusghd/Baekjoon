import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 누적합 배열 A 생성
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 누적합 배열 B 생성
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < B.length; i++) {
            B[i] = B[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 누적합 배열 B 의 부분합을 전부 저장
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length - 1; i++) {
            for (int j = i + 1; j < B.length; j++) {
                int key = B[j] - B[i];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        // T - A(i,j) 연산 개시
        long count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int cal = T - (A[j] - A[i]);
                count += map.getOrDefault(cal, 0);
            }
        }

        System.out.println(count);
    }
}
