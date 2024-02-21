package easy;

import java.util.Arrays;

public class FlipIntMakeArray {
    public static void main(String[] args){
        solution(12345);
    }
    public static int[] solution(long n) {
        String[] tmp = String.valueOf(n).split("");
        int[] answer = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            answer[i]=Integer.parseInt(tmp[tmp.length-i-1]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
