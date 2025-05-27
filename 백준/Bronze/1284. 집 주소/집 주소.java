import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String N = br.readLine();
            if (N.equals("0")) break;
            list.add(N);
        }

        for (int i = 0; i < list.size(); i++) {
            // 1. 양끝 여백을 더함
            int sum = 2;

            // 2. 숫자 사이 여백을 더함
            String num = list.get(i);
            sum += num.length() - 1;

            // 3. 숫자의 너비를 더함
            char[] chars = num.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1') {
                    sum += 2;
                } else if (chars[j] == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }

            System.out.println(sum);
        }


    }
}