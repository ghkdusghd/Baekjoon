import java.util.*;

public class Main {

    static int read() throws Exception {
        int c, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int H = read();
        int W = read();
        int[][] square = new int[H][W];
        for (int i = 0; i < W; i++) {
            int block = read();
            for (int j = H-1; j >= 0; j--) {
                if (block == 0) break;
                square[j][i] = 1;
                block--;
            }
        }

        int total = 0;
        for (int i = 0; i < H; i++) {
            Stack<String> stack = new Stack<>();
            int sum = 0;
            for (int j = 0; j < W; j++) {
                if (square[i][j] == 1) {
                    if (stack.contains("벽")) {
                        total += sum;
                        sum = 0;
                    }
                    stack.push("벽");
                } else {
                    if (stack.isEmpty()) continue;
                    sum++;
                }
            }
        }
        System.out.println(total);
    }

}
