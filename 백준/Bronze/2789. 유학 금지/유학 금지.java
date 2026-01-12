import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        String email = br.readLine();
        String univ = "CAMBRIDGE";

        for (int i = 0; i < email.length(); i++) {
            char temp = email.charAt(i);
            int count = 0;
            for (int j = 0; j < univ.length(); j++) {
                char c = univ.charAt(j);
                if (temp == c) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                builder.append(temp);
            }
        }

        System.out.println(builder);
    }

}