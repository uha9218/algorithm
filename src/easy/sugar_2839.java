package easy;

import java.util.Scanner;

public class sugar_2839 {
    public static void main(String[] args) {

        //5로 나눈 나머지가
        //3: 5로나눈몫 +1
        //1: 5로나눈몫 -1+2
        //4: 5로나눈몫 -1+3
        //2: 5로나눈몫 -2+4
        //0: 5로나눈몫 -0+0
        //exception 1 2 4 7 -> -1

        Scanner sc = new Scanner(System.in);

        int n = 0;

        n = sc.nextInt();
        int answer=-1;
        int tmp = n % 5;

        if(n==4 || n==7){
            answer = -1;
        } else {
            switch (tmp) {
                case 0:
                    answer = n / 5;
                    break;
                case 1:
                case 3:
                    answer = n / 5 + 1;
                    break;
                case 2:
                case 4:
                    answer = n / 5 + 2;
                    break;
            }
        }
        System.out.println(answer);
    }
}
