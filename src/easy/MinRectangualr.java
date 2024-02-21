package easy;

public class MinRectangualr {
    public static void main(String[] args){
        int[][] arr={{14,4},{19,6},{6,16},{18,7},{7,11}};
        solution(arr);
    }
    public static int solution(int[][] sizes){
        int answer=0;
        int height=0;
        int width=0;

        for(int[] s : sizes){
            height = Math.max(height,Math.max(s[0],s[1]));
            width = Math.max(width,Math.min(s[0],s[1]));
        }
        answer = height * width;
        return answer;
    }

}
