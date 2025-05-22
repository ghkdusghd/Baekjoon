import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int sheep = 0;
        int goat = 0;

        int count = 0; // 가능한 해가 몇 개 있는지 체크하는 변수
        for (int i = 1; i < n; i++) {
            if (a * (n-i) + b * i == w) {
                sheep = n - i;
                goat = i;
                count++;
            }
        }
        // 가능한 해가 2개 이상이거나 양, 염소가 0마리면 -1 을 출력한다.
        if (count == 1) {
            System.out.println(sheep + " " + goat);
        } else {
            System.out.println(-1);
        }
    }
}