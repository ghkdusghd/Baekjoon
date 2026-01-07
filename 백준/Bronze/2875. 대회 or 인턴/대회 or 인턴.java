
public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        int M = read();
        int K = read();

        int count = 0;
        for (int i = 0; i <= K; i++) {
            int female = (N - (K - i)) / 2;
            int male = M - i;
            int temp = female > male ? male : female;
            count = temp > count ? temp : count;
        }

        System.out.println(count);
    }

}