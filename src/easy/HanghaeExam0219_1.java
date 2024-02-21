package easy;/*
*서현이의 잔돈 계산기! (1점)

* 설명) 서현이가 1000원을 가지고 편의점에서 물건을 사려고 한다.

편의점에는 500원, 100원, 50원, 10원이 충분히 있고, 편의점 직원은 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.

서현이가 편의점에서 물건을 사고 1000원 지폐 한 장을 냈을 때, 받을 잔돈의 개수를 구하는 프로그램을 작성하여라.
(단, 물건의 가격은 10원 이상 1000원 미만이며, 1원 단위는 고려하지 않는다.)

*입출력 예시
900	1
550	5
320	6
160	8

* 풀이 방법 :
* 해당 문제는 가장 큰 단위의 동전부터 차례대로 거스름돈을 계산하는 그리디 알고리즘
*/

public class HanghaeExam0219_1 {

    public static int solution(int num) {
        int answer = 0;
        int[] change = {500,100,50,10};
        num=1000-num;
        for (int i = 0; i < change.length; i++) {
            answer += num/change[i];
            num = num - change[i] * (num/change[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 320;
        System.out.println(solution(num1));
    }

}
