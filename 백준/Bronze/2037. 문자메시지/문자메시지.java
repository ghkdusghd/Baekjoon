import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static char[][] dial = {
            {'A','B','C'}, {'D','E','F'}, {'G','H','I'},
            {'J','K','L'}, {'M','N','O'}, {'P','Q','R','S'},
            {'T','U','V'}, {'W','X','Y','Z'}
    };

    static int prevGroup = -1;

    public static int cal(char c, int p, int w) {
        int sum = 0;
        for (int i = 0; i < dial.length; i++) {
            for (int j = 0; j < dial[i].length; j++) {
                if (dial[i][j] == c) {
                    if (prevGroup == i) sum += w;
                    sum += (j + 1) * p;
                    prevGroup = i;
                    return sum;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String time = br.readLine();
        String msg = br.readLine();
        StringTokenizer timeTokens = new StringTokenizer(time);
        StringTokenizer msgTokens = new StringTokenizer(msg);
        int p = Integer.parseInt(timeTokens.nextToken());
        int w = Integer.parseInt(timeTokens.nextToken());
        br.close();

        int sum = 0;
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c == ' ') {
                sum += p;
                prevGroup = -1;
                continue;
            }
            sum += cal(c, p, w);
        }
        System.out.println(sum);
    }

}
