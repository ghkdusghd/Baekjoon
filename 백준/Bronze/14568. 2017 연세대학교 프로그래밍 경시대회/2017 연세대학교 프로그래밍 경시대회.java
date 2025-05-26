import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        for (int a = 2; a < n; a+=2) {
            int m = n - a;
            if (m < 3) {
                break;
            }
            for (int b = 1; b < m; b++) {
                if (m - b >= b + 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}