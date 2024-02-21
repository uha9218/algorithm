package easy;

import java.util.HashSet;
import java.util.Set;

public class LottoScore3 {
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums={38, 19, 20, 40, 15, 25};
        solution(lottos,win_nums);
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int losingNumCount=0;
        int matchNumCount=0;
        Set<Integer> lottoSet = new HashSet<>();
        for(int lotto : lottos){
            if(lotto==0){
                losingNumCount++;
                continue;
            }
            lottoSet.add(lotto);
        }

        for(int win_num:win_nums){
            if(lottoSet.contains(win_num)) matchNumCount++;
        }

        answer[0]= 7-(matchNumCount+losingNumCount) >= 6 ? 6 : 7-(matchNumCount+losingNumCount);
        answer[1]= (7-matchNumCount)>=6 ? 6 : 7-matchNumCount;

        return answer;
    }
}
