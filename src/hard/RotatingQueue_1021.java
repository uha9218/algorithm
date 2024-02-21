package hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class RotatingQueue_1021 {

    public static int findLoc(Deque<Integer> deq, int num){
        Iterator<Integer> iterator = deq.iterator();
        int position = 0;

        while (iterator.hasNext()) {
            if (iterator.next() == num) {
                return position;
            }
            position++;
        }
        return position;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input1 = br.readLine();
        st = new StringTokenizer(input1);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer=0;

        //deque를 만듦
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i =0; i<n; i++){
            deq.offer(i+1);
        }

        String input2 = br.readLine();
        st = new StringTokenizer(input2);

        while (st.hasMoreTokens()){
            int findNum = Integer.parseInt(st.nextToken());
            int loc = findLoc(deq,findNum);

            if(deq.size()/2>=loc){  //찾는 수가 deq 절반보다 앞에 있는 경우
                while(true){
                    int tmp = deq.pollFirst();  //deq의 앞의 숫자를 뺀 후
                    if(findNum == tmp){ //같은지 확인, 같으면 break
                        break;
                    }
                    answer++;   //이동 횟수 증가
                    deq.offer(tmp); //다르면 deq의 뒤에 넣음, 이동횟수 증가
                }
            }else{  //찾는 수가 deq의 절반 보다 뒤에 있는 경우
                while(true){
                    int tmp = deq.pollLast();  //deq의 뒤의 숫자를 뺀 후
                    if(findNum == tmp){ //같은지 확인, 같으면 break
                        answer++;
                        break;
                    }
                    answer++; //이동 횟수 증가
                    deq.offerFirst(tmp); //다르면 deq의 앞에 넣음
                }
            }
        }
        System.out.println(answer);
    }
}
