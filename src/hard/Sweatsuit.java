package hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sweatsuit {
    public static void main(String[] args) {
        int n=5;
        int[] lost = {4,2};
        int[] reserve = {5,3};
        System.out.println(solution(n,lost,reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer =n;
        int lostSuitStudent = 0;
        //Map만들기
        Map<Integer,Integer> studentMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
               studentMap.put(i+1,1);
        }
        for (int i = 0; i < reserve.length; i++) {
            if(studentMap.containsKey(reserve[i])){studentMap.replace(reserve[i], studentMap.get(reserve[i])+1);}
        }
        Arrays.sort(lost);
        for (int i = 0; i < lost.length; i++) {
            if(studentMap.containsKey(lost[i])){studentMap.replace(lost[i], studentMap.get(lost[i])-1);}
        }
        for (int i = 0; i < lost.length; i++) {
            //가지고 있는 체육복이 없는 경우
            if(studentMap.get(lost[i])==0){
                //앞번호 학생이 존재하고 체육복이 두개라면
                if(studentMap.containsKey(lost[i]-1) && studentMap.get(lost[i]-1)==2){
                    studentMap.replace(lost[i]-1,1);
                    studentMap.replace(lost[i],1);
                    continue;
                }else if(studentMap.containsKey(lost[i]+1) && studentMap.get(lost[i]+1)==2){
                    //뒷번호 학생이 존재하고 체육복이 두개라면
                    studentMap.replace(lost[i]+1,1);
                    studentMap.replace(lost[i],1);
                    continue;
                }else{
                    //체육복을 빌리지 못한 경우
                    lostSuitStudent++;
                }
            }
        }
        answer -= lostSuitStudent;
        return answer;
    }
}
