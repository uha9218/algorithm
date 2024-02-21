package easy;

import java.io.*;
import java.util.StringTokenizer;

public class Blackjack_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        // 총 카드의 개수
        int n = Integer.parseInt(st.nextToken());
        // target number
        int m = Integer.parseInt(st.nextToken());

        String[] line = bufferedReader.readLine().split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(line[i]);

        }
        // i == 0
        // j == 1
        // k == 2
        int tempSum = 0;
        for (int i = 0; i < n -2 ; i++) {
            for (int j = i+1; j < n -1 ; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum == m) {
//                        bufferedWriter.write(m + "\n");
                        bufferedWriter.write(Integer.toString(m));
//                        bufferedWriter.write(m + "\n"); //
                        bufferedWriter.close(); // return 하기 전에 무조건 close 해야함
                        return;
                    }
                    if (sum < m) {
                        tempSum = Math.max(sum, tempSum);
                    }
                }
            }
        }
        bufferedWriter.write(tempSum);
        bufferedWriter.close();
    }
}
