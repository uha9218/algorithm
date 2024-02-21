package easy;

import java.util.Arrays;

public class LottoScore2 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums={31, 10, 45, 1, 6, 19};
        solution(lottos,win_nums);
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int losingNumCount=0;
        int matchNumCount=0;
        //배열 정렬
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for(int lotto : lottos){
            if(lotto==0){
                losingNumCount++;
                continue;
            }
            for(int win_num : win_nums){
                if(lotto==win_num){
                    matchNumCount++;
                    break;
                }
            }
        }

        answer[0]= 7-(matchNumCount+losingNumCount) >= 6 ? 6 : 7-(matchNumCount+losingNumCount);
        answer[1]= (7-matchNumCount)>=6 ? 6 : 7-matchNumCount;

        System.out.println(answer[0]+" "+answer[1]);
        return answer;

    }

}
