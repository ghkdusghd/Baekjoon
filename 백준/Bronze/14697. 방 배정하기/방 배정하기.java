import java.util.Arrays;

public class Main {

    public static int[] ary = new int[3];
    public static int N;
    public static int count = 2;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 3; i++) {
            ary[i] = read();
        }
        N = read();

        cal(N);

    }

    public static void cal(int n) {
        int temp = n % ary[count];
        if (temp == 0) {
            System.out.println("1");
        } else {
            count--;
            if (count == -1) {
                System.out.println("0");
                return;
            }
            cal(temp);
        }
    }

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

}