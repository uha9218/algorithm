package cantSolve;

import java.util.ArrayList;
import java.util.List;

public class InformationCollectPeriod {
    public static void main(String[] args) {
        String today = "2020.10.15";
        String[] terms = {"A 100"};
        String[] privacies ={"2018.06.16 A", "2008.02.15 A"};
        solution(today,terms,privacies);
    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        // today : String -> Int
        today=today.replace(".","");
        int todayInt = Integer.parseInt(today);

        // privacies 유효 만료 날짜 계산
        int[] privacyExpire = new int[privacies.length];
        List<Integer> ExpireAlphabet =new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            char privacyCategory = privacies[i].charAt(privacies[i].length()-1);
            for (int j = 0; j < terms.length; j++) {
                if(privacyCategory==terms[j].charAt(0)){
                    //privacies의 날짜 String -> int
                    privacies[i] = privacies[i].replace(".","");
                    privacies[i] = privacies[i].split(" ")[0];
                    privacyExpire[i] = Integer.parseInt(privacies[i]);

                    //privacies 만료 날짜 계산
                    privacyExpire[i] = privacyExpire[i]+Integer.parseInt(terms[j].substring(terms[j].lastIndexOf(" ")+1))*100 -1;
                    //만료일이 00일이 되었을때 이전 달로 변경
                    if( privacyExpire[i]%100 ==0){
                        privacyExpire[i] = privacyExpire[i] -100 +28;
                    }
                    //만료일의 달이 12월이 넘어갈 경우
                    if(privacyExpire[i] % 10000 > 1300){
                        privacyExpire[i] = privacyExpire[i] + 10000 -1200;
                    }

                    //만료일과 현재를 비교해서 파기 여부 결정
                    if(privacyExpire[i]<todayInt) {
                        ExpireAlphabet.add(i+1);
                    }
                }
            }
        }
        answer = new int[ExpireAlphabet.size()];
        for (int i = 0; i < ExpireAlphabet.size(); i++) {
            answer[i]= ExpireAlphabet.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

}
