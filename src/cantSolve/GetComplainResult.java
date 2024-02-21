package cantSolve;

import java.util.*;

public class GetComplainResult {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        solution(id_list,report,k);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Arrays.fill(answer,0);
        //신고 명단을 만드는 map 선언
        Map<String, List<String>> complainMap = new HashMap<>();
        Map<String,Integer> complainCountMap = new HashMap<>();
        List<String> warnUser = new ArrayList<>();
        for(String id : id_list){
            List<String> list = new ArrayList<>();
            complainMap.put(id,list);
            complainCountMap.put(id,0);
        }
        //신고 명단 만들기
        for(String r : report){
            String[] reportIndex = r.split(" ");
            if(complainMap.get(reportIndex[0]).contains(reportIndex[0])) {
                complainMap.get(reportIndex[0]).add(reportIndex[1]);
            }
        }
        //신고 개수 카운트
        for (String complain : complainMap.keySet()) {
            complainCountMap.replace(complain, complainCountMap.get(complain)+1);
            //신고 개수가 정지 범위를 넘어가는 경우
            if(complainCountMap.get(complain)>=k){
                warnUser.add(complain);
            }
        }
        //신고한 유저가 정지를 받게 될 경우 정답 배열에 받는 이메일 개수 추가
        for (String user : complainMap.keySet()) {
            List<String> userComplains = complainMap.get(user);
            for (String complainTarget : userComplains) {
                if (warnUser.contains(complainTarget)) {
                    int userIndex = Arrays.asList(id_list).indexOf(user);
                    answer[userIndex]++;
                }
            }
        }
        return answer;
    }
}
