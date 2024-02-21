package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet_10809 {

    public static void main(String[] args)throws IOException {
        //변수 선언 및 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] answer = new int[26];
        Arrays.fill(answer,-1);

        //처리
        for(int i=0;i<input.length();i++){
            int tmp = input.charAt(i) - 97;
            if(answer[tmp]!=-1){
                continue;
            }
            answer[tmp]=i;
        }
        //출력
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
