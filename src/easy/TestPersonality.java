package easy;

import java.util.HashMap;
import java.util.Map;

public class TestPersonality {
    public static void main(String[] args) {
        String [] survey = {"AN"};
        int[] choice = {7};
        System.out.println(solution(survey,choice));
    }
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        //성격 유형 점수 결과를 담을 Map을 생성
        Map<Character,Integer> scoreMap = new HashMap<>();
        char[] personality = {'R','T','C','F','J','M','A','N'};
        for(char i : personality){
            scoreMap.put(i,0);
        }
        //얻은 점수를 Map에 반영
        for (int i = 0; i < survey.length; i++) {
            if(choices[i]==4){
                continue;
            } else if (choices[i]>4) {
                int score = scoreMap.get(survey[i].charAt(1)) + (choices[i]-4) ;
                scoreMap.replace(survey[i].charAt(1),score);
            } else{
                int score = scoreMap.get(survey[i].charAt(0)) + (4-choices[i]) ;
                scoreMap.replace(survey[i].charAt(0),score);
            }
        }
        //Map을 토대로 성격 유형 결과 출력
        answer += (scoreMap.get('R')>=scoreMap.get('T')) ? 'R' : 'T';
        answer += (scoreMap.get('C')>=scoreMap.get('F')) ? 'C' : 'F';
        answer += (scoreMap.get('J')>=scoreMap.get('M')) ? 'J' : 'M';
        answer += (scoreMap.get('A')>=scoreMap.get('N')) ? 'A' : 'N';

        return answer;
    }
}
