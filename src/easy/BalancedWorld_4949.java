package easy;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedWorld_4949 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String input = bf.readLine();
            Deque<Character> temp = new ArrayDeque<>();
            boolean end = false;
            if(input.equals(".")) {//. 입력시 프로그램 종료
                break;
            }
            for(int i=0;i<input.length();i++) {
                if (input.charAt(i) == '(' || input.charAt(i) == '[') {
                    temp.push(input.charAt(i));
                } else if (input.charAt(i) == ')') {
                    if(temp.isEmpty()||temp.peek() !='(') {
                        bw.write("no"+"\n");
                        end = true;
                        break;
                    }
                    temp.pop();
                } else if (input.charAt(i) == ']') {
                    if(temp.isEmpty()||temp.peek() !='[') {
                        bw.write("no"+"\n");
                        end = true;
                        break;
                    }
                    temp.pop();
                }
            }
            if(!end && !temp.isEmpty()){
                bw.write("no"+"\n");
            }else if(!end){
                bw.write("yes"+"\n");
            }

        }
        bw.close();
    }
}
