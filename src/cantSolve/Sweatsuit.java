package cantSolve;

import java.util.Arrays;

public class Sweatsuit {
    public static void main(String[] args) {
        int n=10;
        int[] lost = {3,4,7,9};
        int[] reserve = {2,3,8};
        System.out.println(solution(n,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int haveSuitStudent= n-lost.length;
        for (int i = 0; i < reserve.length; i++) {
            int tmp = Arrays.binarySearch(lost,reserve[i]);
            if(tmp>=0){ //lost와 reserve가 겹치면
                reserve[i]=0;
                lost[tmp]=0;
                haveSuitStudent++;
            }
        }
        Arrays.sort(reserve);
        Arrays.sort(lost);
        for (int i = 0; i < lost.length; i++) {
            if(lost[i]==0) {
                continue;    //lost와 reverse가 겹친 경우
            }
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j]==0) {
                    continue;
                }
                if(lost[i]-1==reserve[j] || lost[i]+1==reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    haveSuitStudent++;
                    break;
                }
            }
        }
        answer = haveSuitStudent;
        return answer;
    }
}
