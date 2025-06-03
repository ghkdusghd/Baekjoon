import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    x = j;
                    y = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n");
        sb.append(y + 1).append(" ").append(x + 1);
        System.out.println(sb);
    }
}
