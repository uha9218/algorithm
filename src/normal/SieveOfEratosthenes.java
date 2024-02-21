package normal;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static boolean[] prime;  //소수를 체크할 배열
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        check_prime(n);

        for(int i=0;i<prime.length;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }

    //n이하의 소수 체크 메소드
    public static void check_prime(int n){
        prime = new boolean[n+1];
        int count=0;
        //소수인 인덱스 false

        if(n<2){return;}    // n이 2 미만인 경우 판별할 필요 없음

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
        System.out.println("소수의 개수:"+count);
    }
}
