package easy;

import java.io.*;

public class DecompositionSum_2231 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean haveAnswer = false;

        for(int i=1;i<n;i++){
            // 각 자리 수의 합을 구는 로직
            int tempNum = i;
            int tempSum = 0;
            while (tempNum>0) {
                tempSum += tempNum % 10;
                tempNum /= 10;
            }
            if(tempSum+i == n){             // sum = tempSum + i
                bw.write(i+"");
                haveAnswer = true;
                break;
            }
        }
        if(!haveAnswer){bw.write(0+"");}
        bw.close();
    }
}
