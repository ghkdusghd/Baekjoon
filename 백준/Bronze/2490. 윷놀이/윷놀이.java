import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char check(int sum) {
        if (sum == 1) { // 도
            return 'A';
        } else if (sum == 2) { // 개
            return 'B';
        } else if (sum == 3) { // 걸
            return 'C';
        } else if (sum == 4) { // 윷
            return 'D';
        } else { // 모
            return 'E';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int input = 0;
        while (input < 3) {
            int sum = 0;
            String line = br.readLine();
            for (int i = 0; i < line.length(); i += 2) {
                char c = line.charAt(i);
                if (c == '0') {
                    sum += 1;
                }
            }
            sb.append(check(sum)).append("\n");
            input++;
        }
        System.out.println(sb);
    }

}
