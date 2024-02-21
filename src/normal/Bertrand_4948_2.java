package normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bertrand_4948_2 {
    public static boolean[] prime;  // 소수를 체크할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n;

        do {
            n = Integer.parseInt(bf.readLine()); // 사용자 입력 변수
            if (n == 0) {
                break;  // 0이 입력되면 종료
            }

            int count = countPrimesBetween(n + 1, 2 * n);
            System.out.println(count);

        } while (true);
    }

    public static int countPrimesBetween(int start, int end) {
        prime = new boolean[end + 1];
        int count = 0;    // 소수의 개수

        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= end; i++) {
            if (prime[i]) {
                continue;   // 체크된 배열 skip
            }
            for (int j = i * i; j <= end; j += i) {
                prime[j] = true;
            }
        }

        for (int i = start; i <= end; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }
}
