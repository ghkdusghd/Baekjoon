import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;
            line = line.toLowerCase();
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    sum += 1;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}
