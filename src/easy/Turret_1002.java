package easy;

import java.util.Scanner;

public class Turret_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] output = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (d == 0) {
                // 두 원의 중심이 동일한 경우
                if (r1 == r2) {
                    output[i] = -1; // 무한대의 해가 존재
                } else {
                    output[i] = 0; // 해가 존재하지 않음
                }
            } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                output[i] = 1; // 두 원이 외접하거나 내접하는 경우
            } else if (d < r1 + r2 && d > Math.abs(r1 - r2)) {
                output[i] = 2; // 두 원이 교차하는 경우
            } else {
                output[i] = 0; // 그 외의 경우
            }
        }

        for (int i = 0; i < testcase; i++) {
            System.out.println(output[i]);
        }
    }
}