package hard;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackSequence_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> number = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[n]; // [1,2,3,.. ,8]

        for (int j = 0; j < n; j++) {
            int tmp = Integer.parseInt(bufferedReader.readLine());

            if (stack.contains(tmp)) {   //stack 내부에 있는 수인지
                if (stack.peekFirst() == tmp) { //스택 최상단 숫자인지
                    answer.append("-"+"\n");
                    number.push(stack.pop());
                } else {
                    answer.append("no");
                    bw.write("NO");
                    bw.close();
                    return ;
                }
            } else {
                for (int i = 1; i < tmp + 1; i++) {
                    if (stack.contains(i) || number.contains(i)) {
                        continue;
                    }
                    stack.push(i);
                    answer.append("+"+"\n");
                }
                number.push(stack.pop());
                answer.append("-"+"\n");
            }
        }

        System.out.println(answer);
        bw.close();
    }
}
