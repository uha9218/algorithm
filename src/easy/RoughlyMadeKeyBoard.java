package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RoughlyMadeKeyBoard {
    public static void main(String[] args) {
        String[] keyMap = {"AGZ", "BSSS"};
        String[] targets={"ASA","BGZ"};
        solution(keyMap,targets);
    }
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Arrays.fill(answer,0);

        Map<Character,Integer> alphaIndex = new HashMap<>();

        //각 알파벳 위치가 담겨있는 Map 만들기
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if(alphaIndex.containsKey(keymap[i].charAt(j))){
                    if(alphaIndex.get(keymap[i].charAt(j))>j){
                        alphaIndex.replace(keymap[i].charAt(j),j+1);
                    }
                }else{
                    alphaIndex.put(keymap[i].charAt(j),j+1);
                }
            }
        }

        //targets를 만드려면 몇번 눌러야하는지 count 하기
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if(alphaIndex.containsKey(targets[i].charAt(j))){
                    answer[i] += alphaIndex.get(targets[i].charAt(j));
                }else{
                    answer[i] =-1;
                    break;
                }
            }
            System.out.println(answer[i]);
        }
        return answer;
    }
}
