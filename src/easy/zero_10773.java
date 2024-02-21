package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());
        Stack<Integer> input = new Stack<>();
        int answer = 0;

        for(int i=0;i<k;i++){
            int tmp = Integer.parseInt(bf.readLine());
            if(tmp == 0){input.pop();}
            else {
                input.push(tmp);
            }
        }
        while(!input.empty()){
            int tmp = input.pop();
            answer += tmp;
        }
        System.out.println(answer);
    }
}
