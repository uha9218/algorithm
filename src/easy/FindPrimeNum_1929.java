package easy;

import java.util.Scanner;

public class FindPrimeNum_1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m= sc.nextInt();
        int n= sc.nextInt();

        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i = 2; i * i <= n; i++){
            if(prime[i]){continue;}

            for(int j=i*i;j<=n;j=j+i){
                prime[j]=true;
            }
        }

        for(int i=m;i<=n;i++){
            if(!prime[i]) System.out.println(i);
        }
    }
}
