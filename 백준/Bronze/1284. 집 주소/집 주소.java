import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String N = br.readLine();
            if (N.equals("0")) break;
            int sum = N.length() + 1; // 양 끝 여백 + 숫자간 여백 더함

            for (int i = 0; i < N.length(); i++) {
                char num = N.charAt(i);
                if (num == '1') {
                    sum += 2;
                } else if (num == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}