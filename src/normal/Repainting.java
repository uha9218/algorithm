package normal;

import java.util.Stack;

public class Repainting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int answer = solution(4,1,arr);
        System.out.println(answer);
    }
    public static int solution(int n, int m, int[] section) {
        int answer=1;
        //1. section 을 거꾸로 넣은 스택을 생성
        Stack<Integer> sectionStack = new Stack<>();
        for(int i=0;i<section.length;i++){
            sectionStack.push(section[section.length-i-1]);
        }

        int tmp = sectionStack.pop();
        //2. 스택이 비워질때까지 메소드 실행
        while(!sectionStack.isEmpty()){
            //3. 한번에 칠할 수 있는지 비교
            if(sectionStack.peek()<tmp+m){
                sectionStack.pop();
            }else{
                tmp=sectionStack.pop();
                answer++;
            }
        }
        return answer;
    }
}
