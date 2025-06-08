import java.io.*;

public class Main {
    static int max;
    static int N;
    static int process(int[] A, int[] B) {
        for (int i = 1; i < N + 1; i++) {
            int temp = A[i-0] + B[N] - B[i-1];
            max = max < temp ? temp : max;
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] P = new int[N + 1];
        int[] H = new int[N + 1];
        int[] S = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            char input = br.readLine().charAt(0);
            if (input == 'P') {
                P[i] = P[i-1] + 0;
                H[i] = H[i-1] + 0;
                S[i] = S[i-1] + 1;
            }
            if (input == 'H') {
                P[i] = P[i-1] + 1;
                H[i] = H[i-1] + 0;
                S[i] = S[i-1] + 0;
            }
            if (input == 'S') {
                P[i] = P[i-1] + 0;
                H[i] = H[i-1] + 1;
                S[i] = S[i-1] + 0;
            }
        }

        process(H,P);
        process(H,S);
        process(P,S);
        process(P,H);
        process(S,H);
        process(S,P);

        System.out.println(max);
    }
}
