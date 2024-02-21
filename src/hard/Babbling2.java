package hard;

public class Babbling2 {
    public static void main(String[] args) {
        String[] babbling = {"maya"};
        System.out.println(solution(babbling));
    }
    public static int solution(String[] babblings) {
        int answer = 0;
        for(String babbling : babblings){
            //연달아 발음 제거
            if(babbling.contains("ayaaya") || babbling.contains("yeye") || babbling.contains("woowoo") || babbling.contains("mama")){
                continue;
            }
                //babbling이 가능한 단어이면 빈 String으로 교체
            babbling = babbling.replace("aya", " ");
            babbling = babbling.replace("ye", " ");
            babbling = babbling.replace("woo", " ");
            babbling = babbling.replace("ma", " ");

            babbling = babbling.replace(" ","");
            if(babbling.equals("")){answer++;}


        }
        return answer;
    }
}
