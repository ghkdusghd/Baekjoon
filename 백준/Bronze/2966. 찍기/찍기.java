import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static int[] answer = {0, 0, 0};
    public static int adrian = 0;
    public static int bruno = 0;
    public static int goran = 3;
    public static int varBruno = -1;
    public static int varGoran = 0;
    public static int j = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            char temp = str.charAt(i);
            switch (temp) {
                case 'A' :
                    input[i] = 1;
                    break;
                case 'B' :
                    input[i] = 2;
                    break;
                case 'C' :
                    input[i] = 3;
                    break;
            }
        }

        for (int i = 0; i < N; i++) {
            // 상근
            adrian = i % 3 + 1;
            int checkAdrian = (adrian == input[i]) ? 1 : 0;
            answer[0] += checkAdrian;

            // 창영
            if(i % 2 != 0) {
                bruno = 2 + varBruno;
                varBruno = varBruno * -1;
            } else {
                bruno = 2;
            }
            int checkBruno = (bruno == input[i]) ? 1 : 0;
            answer[1] += checkBruno;

            // 현진
            if (varGoran == 2) {
                goran = j % 3 + 1;
                j++;
                varGoran = 1;
            } else {
                varGoran++;
            }
            int checkGoran = (goran == input[i]) ? 1 : 0;
            answer[2] += checkGoran;
        }

        int max = 0;
        for (int i = 0; i < answer.length; i++) {
            max = (max > answer[i]) ? max : answer[i];
        }
        System.out.println(max);

        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i]) {
                switch (i) {
                    case 0 :
                        System.out.println("Adrian");
                        break;
                    case 1 :
                        System.out.println("Bruno");
                        break;
                    case 2 :
                        System.out.println("Goran");
                        break;
                }
            }
        }

    }

}