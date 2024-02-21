package normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bertrand_4948 {
    public static boolean[] prime;  //소수를 체크할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        do {

            n = Integer.parseInt(bf.readLine()); //사용자 입력 변수

            if (n == 0) {
                break;  // 0이 입력되면 종료
            }

            int firstNum=check_prime(n);
            int secondNum=check_prime(n*2);

            System.out.println(secondNum-firstNum);

        }while(true);


    }
    public static int check_prime(int n){
        prime = new boolean[n+1];
        int count=0;    //소수의 개수
        //소수인 인덱스 false

        if(n<2){return 0;}    // n이 2 미만인 경우 판별할 필요 없음

        prime[0]=prime[1]=true;

        for(int i=2; i< Math.sqrt(n);i++){
            if(prime[i]==true){continue;}   //체크된 배열 skip
            for(int j=i*i;j<prime.length;j=j+i){
                prime[j]=true;
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false) count++;
        }
        return count;
    }
}
