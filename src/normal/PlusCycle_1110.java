package normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int n=Integer.parseInt(bf.readLine());
        int tmp=n;

        while(true) {      // tmp = 26 이라 가정
            int a = tmp / 10;
            int b = tmp % 10;
            count++;
            if (tmp < 10) tmp = tmp * 10;
            tmp = b * 10 + ((a + b) % 10);

            if (n == tmp) break;
        }
        System.out.println(count);

    }
}
