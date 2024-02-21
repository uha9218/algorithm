package hard;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings= {"kai", "kai", "mine", "mine"};
        solution(players,callings);
    }
    public static String[] solution(String[] players, String[] callings) {
        String[] answer ;
        Map<String,Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i],i);
        }
        for (int i = 0; i < callings.length; i++) {
            //바뀌는 배열의 index 찾기
            int rankUpPlayer = rankMap.get(callings[i]);

            //배열 바꾸기
            String rankDownPlayer = players[rankUpPlayer-1];
            players[rankUpPlayer-1] = callings[i];
            players[rankUpPlayer] = rankDownPlayer;

            //map바꾸기
            rankMap.replace(callings[i], rankUpPlayer-1);
            rankMap.replace(rankDownPlayer, rankUpPlayer);
        }
        answer = players.clone();
        return answer;
    }
}
