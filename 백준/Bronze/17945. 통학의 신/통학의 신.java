import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A,B 입력 받음. A의 경우 문제에서 제시한 방정식이 2A 이므로 2를 곱해준다.
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }

    public static String solution(int A, int B) {
        List<Integer> result = new ArrayList<>();

        for (int i = -1000; i <= 1000; i++) {
            if (sik(A, B, i)) result.add(i);
        }

        StringBuilder output = new StringBuilder();

        output.append(result.get(0));

        if (result.size() == 2) {
            output.append(" ").append(result.get(1));
        }

        return output.toString();
    }

    public static boolean sik(int A, int B, int x) {
        return x * x + 2 * A * x + B == 0;
    }
}