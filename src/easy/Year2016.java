package easy;

public class Year2016 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        int[] dayInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        int sumOfDays=0;
        for (int i = 0; i < a-1; i++) {
            sumOfDays += dayInMonth[i];
        }
        sumOfDays += b;

        answer = week[(sumOfDays-1)%7];
        return answer;
    }
}
