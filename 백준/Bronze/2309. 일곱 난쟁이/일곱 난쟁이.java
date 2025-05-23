import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ary = new int[9];

        // 키를 입력받음과 동시에 전체 키를 더해둔다.
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            ary[i] = Integer.parseInt(br.readLine());
            sum += ary[i];
        }

        br.close();

        // 아홉 난쟁이 배열의 합계에서 2개를 뺀 값이 100이 되는 경우의 수를 찾는다.
        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (sum - ary[i] - ary[j] == 100) {
                    ary[i] = 0;
                    ary[j] = 0;

                    // 오름차순 정렬 후 출력
                    Arrays.sort(ary);
                    for (int k = 2; k < ary.length; k++) {
                        System.out.println(ary[k]);
                    }
                    return;
                }
            }
        }
    }
}