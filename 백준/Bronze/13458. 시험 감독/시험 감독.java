public class Main {
    static int read() throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        int n = read();
        double[] rooms = new double[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = read();
        }
        double b = read();
        double c = read();

        long count = 0;
        for (int i = 0; i < n; i++) {
            double temp = rooms[i] - b;
            count++;
            if (temp == 0 || temp < 0) continue;

            double num = temp / c;
            int result = (int) Math.ceil(num);
            count += result;
        }

        System.out.println(count);
    }
}