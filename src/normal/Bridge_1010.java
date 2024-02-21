package normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bridge_1010 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            if (N == M) sb.append(1 + "\n");
            else {
                BigInteger num = combination(M, N) ;

                sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }

    static BigInteger combination(int n, int r) {
        BigInteger rst = new BigInteger("1");
        int i = n;
        while(i > n-r){
            rst = rst.multiply(new BigInteger(Integer.toString(i)));
            i--;
        }
        i = r;
        while(i > 1){
            rst = rst.divide(new BigInteger(Integer.toString(i)));
            i--;
        }
        return rst;
    }

}
