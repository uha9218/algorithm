package easy;

public class ColatzGuess {
    public static void main(String[] args){
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        long input = num;
        while(input!=1){
            if(answer==500){
                return -1;
            }
            if(input%2==0){ input=input/2; }
            else {input=input*3+1;}
            answer++;
            System.out.println(answer+" : "+input);
        }
        return answer;
    }

}
