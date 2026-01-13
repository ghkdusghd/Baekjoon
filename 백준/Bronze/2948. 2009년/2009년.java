
public class Main {

    public static void main(String[] args) throws Exception {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        int D = read();
        int M = read();

        int count = 0;
        for (int i = 0; i < M; i++) {
            count += months[i];
        }
        count += D;
        int n = count % 7 - 1;

        // ArrayIndexOutOFBounds 에 대한 예외 처리
        if (n == -1) {
            System.out.println("Wednesday");
            return;
        }
        
        System.out.println(weeks[n]);
    }

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

}