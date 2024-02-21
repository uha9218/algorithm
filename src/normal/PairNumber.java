package normal;

import java.util.*;

public class PairNumber {
    public static void main(String[] args) {
        System.out.println(solution("111","1111"));
    }
    public static String solution(String x, String y) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        //1. 짝꿍 수들을 담을 리스트 선언
        List<Character> pairNum = new ArrayList<>();
        //2. Map에 x의 수들을 넣음
        Map<Character,Integer> tempMap = new HashMap<Character,Integer>();
        for (int i = 0; i <x.length(); i++) {
            if(tempMap.containsKey(x.charAt(i))){
                int tmp =  tempMap.get(x.charAt(i));
                tempMap.replace(x.charAt(i),++tmp);
            }else{
                tempMap.put(x.charAt(i),1);
            }

        }
        //3. Map의 key에 있는 x의 수와 y의 수 비교
        for (int i = 0; i < y.length(); i++) {
            if(tempMap.containsKey(y.charAt(i)) && tempMap.get(y.charAt(i))!=0){
                pairNum.add(y.charAt(i));
                int tmp = tempMap.get(y.charAt(i));
                tempMap.replace(y.charAt(i),--tmp);
            }
        }
        //4. pairNum list 내림차순 정렬
        pairNum.sort(Comparator.reverseOrder());
        //5. 짝꿍이 있는지 혹은 짝꿍이 0인지 확인
        if(pairNum.isEmpty()){return "-1";}
        if(pairNum.get(0).equals('0')){
            return "0";
        }
        //6. pairNum list 내림차순 정렬 후 String 변환
        for (int i = 0; i < pairNum.size(); i++) {
            stringBuilder.append(pairNum.get(i));
        }
        answer = stringBuilder.toString();
        return answer;
    }
}
