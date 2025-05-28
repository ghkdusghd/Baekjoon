import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String n = br.readLine();
            int result = 0;
            if (n.equals("#")) break;

            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '-') {
                    result += 0 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '\\') {
                    result += 1 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '(') {
                    result += 2 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '@') {
                    result += 3 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '?') {
                    result += 4 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '>') {
                    result += 5 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '&') {
                    result += 6 * Math.pow(8, (n.length() - 1 - i));
                } else if (n.charAt(i) == '%') {
                    result += 7 * Math.pow(8, (n.length() - 1 - i));
                } else {
                    result += -1 * Math.pow(8, (n.length() - 1 - i));
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}