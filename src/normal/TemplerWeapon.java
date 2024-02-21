package normal;// 6의 약수 : 1 2 3 6
// 16의 약수 : 1 2 4 8 16

// n 제곱수 : n의 루트까지의 약수* 2 - 1
// -> 16은 4의 제곱수
//    4까지의 약수 (1,2,4)는 세개
//    즉, 3*2-1 = 5개

// n의 제곱수가 아닌 경우 : n의 루트까지의 약수 * 2
// -> 6은 제곱수가 아님
//    루트 6 까지의 약수 (1,2)는 두개
//    즉 2*2 = 4개

public class TemplerWeapon {
    public static void main(String[] args) {
        System.out.println(solution(10,3,2));
    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++){
            int tmp =0;
            //약수 구하기
            for (int j = 1; j*j <= i ; j++) {
                if(i%j==0){tmp++;}
            }
            //제곱수인 경우
            if(Math.sqrt(i)%1==0){
                tmp = tmp*2-1;
            }else{  //제곱수가 아닌 경우
                tmp=tmp*2;
            }

            //공격력이 제한 수치보다 큰 경우 판별
            if(tmp>limit){
                answer+=power;
            }else {
                answer+=tmp;
            }
        }
        return answer;
    }
}
