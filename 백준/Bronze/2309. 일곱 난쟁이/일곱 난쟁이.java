import java.util.*;

public class Main {

    static int read() throws Exception {
        int n = 0, c = 0;
        while((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int[] dwarfs = new int[9];
        int total = 0;
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = read();
            total += dwarfs[i];
        }

        Loop:
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 9; j++) {
                if (total - dwarfs[i] - dwarfs[j] == 100) {
                    dwarfs[i] = 0;
                    dwarfs[j] = 0;
                    break Loop;
                }
            }
        }

        Arrays.sort(dwarfs);
        for (int i = 2; i < 9; i++) {
            System.out.println(dwarfs[i]);
        }
    }

}
