public class Main {

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int i = 0;
        int sum = 0;

        while (i < 10) {
            int score = read();
            int temp = sum + score;

            if (temp == 100) {
                sum = temp;
                break;
            } else if (temp > 100) {
                sum = (100 - sum >= temp - 100) ? temp : sum;
                break;
            }

            sum = temp;
            i++;
        }

        System.out.println(sum);
    }

}