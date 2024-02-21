package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DivisibleArray {
    public static void main(String[] args){
        int[] arr={5,9,7,10};
        int divisior = 5;
        System.out.println(solution(arr,divisior));
    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) {
                tmp.add(arr[i]);
            }
        }
        if(tmp.isEmpty()){
            answer = new int[1];
            answer[0]=-1;
        }
        else{
            tmp.sort(Comparator.naturalOrder());
            answer = Arrays.stream(tmp.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}
