package normal;

import java.util.Scanner;

public class ACMHotel_10250 {
    public static void main(String[] args){
        //선언
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   //테스트 케이스 개수
        String answer;

        //입력
        for(int i=0; i<t;i++){
            int h=sc.nextInt();
            int w=sc.nextInt();
            int n=sc.nextInt();

            int rnumber = (n - 1) / h + 1;
            int rfloor = n - (rnumber - 1) * h;

            if (rnumber / 10 == 0) {
                answer = rfloor + "0" + rnumber;
            } else {
                answer = rfloor + "" + rnumber;
            }
            System.out.println(answer);
        }
    }
}
