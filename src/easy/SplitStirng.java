package easy;

public class SplitStirng {
    public static void main(String[] args) {
        System.out.println(solution("aaabbaccccabba"));
    }
    public static int solution(String s) {
        int answer = 0;
        int iterator = 0; //비교 대상 번지수
        int sameCount=0;    //비교 대상이랑 같은 경우
        int differntCount=0;    //비교 대상이랑 다른 경우
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(iterator)){sameCount++;}
            else{differntCount++;}
            if(differntCount == sameCount ) {
                iterator = i + 1;
                sameCount = 0;
                differntCount = 0;
                answer++;
            }else{ //"abracadabra"인 경우 ab - ra - ca - da - br - a 예시에서 마지막 분리시 answer 추가
                if(i==(s.length()-1)){answer ++;}
            }
        }
        return answer;
    }
}
