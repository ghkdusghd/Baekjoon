import java.util.*;

public class Main {

    static int read() throws Exception {
        int n = 0, c = 0;
        while ((c = System.in.read()) > 47) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    // 에라토스테네스의 체
    static List<Integer> sieve(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) throws Exception {
        int N = read();
        List<Integer> primes = sieve(N);

        int left = 0, right = 0, sum = 0, count = 0;
        while (left < primes.size()) {
            if (sum == N) {
                count++;
                sum -= primes.get(left);
                left++;
            } else if (sum < N) {
                if (right == primes.size()) break;
                sum += primes.get(right);
                right++;
            } else if (sum > N) {
                sum -= primes.get(left);
                left++;
            }
        }
        System.out.println(count);
    }

}
