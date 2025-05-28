import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int converter(char[] octoNum, char c) {
        if (c == '/') {
            return -1;
        }

        int result = 0;
        for (int i = 0; i < octoNum.length; i++) {
            if (octoNum[i] == c) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] octoNum = {'-', '\\', '(', '@', '?', '>', '&', '%'};

        while (true) {
            String n = br.readLine();
            if (n.equals("#")) break;

            double result = 0;
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                int humanNum = converter(octoNum, c);
                int power = n.length() - 1 - i;
                result += humanNum * Math.pow(8, power);
            }
            sb.append((int)result).append("\n");
        }
        System.out.println(sb);
    }

}