package easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Bracket_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        // '(' 입력시 push
        // ')' 입력시 pop 후 '('가 있는지 확인
        //만약 스택이 비어있으면 no 출력 후 break
        //for문 종료 후 스택에 남아있는 요소가 있을 시 no
        for(int i=0;i<testcase;i++){
            boolean end = false;
            Stack<Character> st = new Stack<>();
            String input = br.readLine();

            for(int j=0;j<input.length();j++){
                char tmp = input.charAt(j);
                if(tmp=='(') st.push('(');
                else if(tmp==')') {
                    if(st.isEmpty()) {
                        bw.write("NO"+"\n");
                        end=true;
                        break;
                    }
                    st.pop();
                }
            }
            if(end==false) {
                if (st.isEmpty()) bw.write("YES" + "\n");
                else bw.write("NO" + "\n");
            }
        }
        bw.close();
    }
}
