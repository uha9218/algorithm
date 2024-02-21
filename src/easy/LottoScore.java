package easy;

public class LottoScore {
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums={38, 19, 20, 40, 15, 25};
        solution(lottos,win_nums);
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCount=0;
        int losingNum=0;
        for(int lotto : lottos){
            if(lotto==0){
                losingNum++;
                continue;
            }
            for(int win_num : win_nums){
                if(lotto==win_num){
                    matchCount++;
                    break;
                }
            }
        }

        //만약 matchCount나 losingNum이 0 이라면 7등이 나오게 됨 -> 예외처리
        answer[0]= 7-(matchCount+losingNum) >= 6 ? 6 : 7-(matchCount+losingNum);
        answer[1]= (7-matchCount)>=6 ? 6 : 7-matchCount;

        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }
}
