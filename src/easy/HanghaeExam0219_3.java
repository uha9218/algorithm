package easy;

/* 소수 찾기! (3점)

*
설명) 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
현지는 s에 나타나는 숫자 중 소수의 최대값과 소수가 아닌 수의 최소값을 찾아
이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하려고 합니다.
예를들어 s가 "2 3 4 5"라면 "4 5"를 리턴하고, "15 3 10 9 7 8"라면 "8 7"을 리턴하면 됩니다.

* 제한사할
- s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
- 문자열에는 소수가 한개 이상 섞여 있습니다.
- 문자열에는 소수가 아닌 수가 한개 이상 섞여 있습니다.
- 음수는 없습니다.

* 입출력
“2 3 4 5”	“4 5”
"15 3 10 9 7 8"	“8 7”
“97 75 88 99 95 92 73”	“75 97”

* 풀이 방법
s을 " "을 기준으로 split 해서 배열에 넣는다
소수인 수는 최대값을 구하고 소수가 아닌 수는 최소값을 구한다
각 수를 String 으로 바꿔 return 한디
*/
public class HanghaeExam0219_3 {

     public static boolean checkPrime(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if(i*i != num){count++;}
            }
        }
        if(count>2) return false;
        else return true;
    }

    public static String solution(String s) {
        String answer = "";
        String[] sSplit = s.split(" ");
        int maxPrime =0;
        int minNotPrime=0;
        for (int i = 0; i < sSplit.length; i++) {
            if(checkPrime(Integer.parseInt(sSplit[i]))){ //소수인 수
                if(maxPrime==0){ maxPrime=Integer.parseInt(sSplit[i]);}
               maxPrime=Math.max(Integer.parseInt(sSplit[i]),maxPrime);
            }else{ //소수가 아닌 수
                if(minNotPrime==0){ minNotPrime=Integer.parseInt(sSplit[i]);}
                minNotPrime=Math.min(Integer.parseInt(sSplit[i]),minNotPrime);
            }

        }
        answer = minNotPrime+" "+maxPrime;
        return answer;
    }

    public static void main(String[] args) {
        String s = "97 75 88 99 95 92 73";
        System.out.println(solution(s));
    }

}
