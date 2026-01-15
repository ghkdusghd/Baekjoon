public class Main {

    public static void main(String[] args) throws Exception {
        int[] chess = {1, 1, 2, 2, 2, 8};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int input = read();
            sb.append(chess[i] - input).append(" ");
        }
        System.out.println(sb);
    }

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

}