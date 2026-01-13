
public class Main {

    public static void main(String[] args) throws Exception {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};

        int D = read();
        int M = read();

        for (int i = 0; i < M; i++) {
            D += months[i];
        }

        System.out.println(weeks[D%7]);
    }

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

}