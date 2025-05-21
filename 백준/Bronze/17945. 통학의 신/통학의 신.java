import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A,B 입력 받음. A의 경우 문제에서 제시한 방정식이 2A 이므로 2를 곱해준다.
        int a = 2 * sc.nextInt();
        int b = sc.nextInt();

        // 인수분해 실행 (m,n 의 범위는 -b <= m,n <= b 가 될 것이다.)
        int m = 0;
        int n = 0;
        if (b > 0 || b == 0) {
            for (int i = b; i >= -b; i--) {
                int j = a - i;
                if (i * j == b) { // 조건을 만족하는 값이 m,n 이 된다. 여기서 +,- 부호를 반전시키면 문제의 정답인 근이 된다.
                    m = -i;
                    n = -j;
                    break;
                }
            }
        }

        if (b < 0) {
            for (int i = b; i <= -b; i++) {
                int j = a - i;
                if (i * j == b) {
                    m = -i;
                    n = -j;
                    break;
                }
            }
        }

        // 오름차순 정렬
        if (m == n) { // 중근인 경우 한 개만 출력
            System.out.println(m);
        } else if (m < n){
            System.out.println(m + " " + n);
        } else {
            System.out.println(n + " " + m);
        }
    }
}