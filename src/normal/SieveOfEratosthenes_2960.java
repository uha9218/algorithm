package normal;

import java.util.Scanner;

public class SieveOfEratosthenes_2960 {
    public static boolean[] check;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        check = new boolean[n+1];
        int count =0;   //몇번째 지운 수인지 확인
        int answer=0;

        check[0]=check[1]=false;    //지운 수이면 true, 아니면 false
        for(int i=2;i<=n;i++){
            if(check[i]==true){ //이미 체크된 경우
                continue;
            }else {
                //소수인 경우
                check[i] = true;
                count++;
                //System.out.println(i+" "+count+check[i]);
                if (k == count) {
                    answer = i;
                    break;
                }

                for (int j = i * i; j <= n; j = j + i) {  //소수의 배수인 경우
                    if(!check[j]) {
                        check[j] = true;
                        count++;
                        //System.out.println(j+" "+count);
                    }
                    if (k == count) {
                        answer = j;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }

}
