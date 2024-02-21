package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CleanDeskTop {
    public static void main(String[] args) {
        String[] wallpaper = {"..", "#."};
        solution(wallpaper);
    }
    public static int[] solution(String[] wallpaper) {
        int[] answer = {0,0,0,0};
        // 파일이 있는 위치 list에 넣기
        List<Integer> haveFileY = new ArrayList<>();
        List<Integer> haveFileX = new ArrayList<>();
        for (int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")){haveFileX.add(i);}
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j)=='#'){
                    haveFileY.add(j);
                }
            }
        }
        //list 정렬 후 최대최소값 answer에 넣기
        Collections.sort(haveFileX);
        Collections.sort(haveFileY);

        answer[0]=haveFileX.get(0);
        answer[1]=haveFileY.get(0);
        answer[2]=haveFileX.get(haveFileX.size()-1)+1;
        answer[3]=haveFileY.get(haveFileY.size()-1)+1;

        return answer;
    }
}
