
public class Main {

    static int n;

    static int read() throws Exception {
        int c = 0, n = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    public static void main(String[] args) throws Exception {
        n = read();
        backTracking(0, "");
    }

    static void backTracking(int count, String origin) {
        if (count == n) {
            System.out.println(origin);
            System.exit(0);
        }
        for (int i = 1; i <= 3; i++) {
            if (check(origin + i)) {
                backTracking(count + 1, origin + i);
            }
        }
    }

    static boolean check(String checkStr) {
        int len = checkStr.length() / 2;
        for (int i = 1; i <= len; i++) {
            if (checkStr.substring(checkStr.length() - i)
                    .equals(checkStr.substring(checkStr.length() - 2 * i, checkStr.length() - i))) {
                return false;
            }
        }
        return true;
    }

}