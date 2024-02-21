package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arrStack = new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();

            switch(input){
                case "size":
                    System.out.println(count);
                    break;
                case "push":
                    int tmp =  Integer.parseInt(st.nextToken());
                    arrStack[count++] = tmp;
                    break;
                case "pop":
                    if(count==0){
                        System.out.println(-1);
                        break;
                    }
                    else{
                        System.out.println(arrStack[--count]);
                        break;
                    }
                case "empty":
                    if(count==0) {
                        System.out.println(1);
                        break;
                    }
                    else {
                        System.out.println(0);
                        break;
                    }
                case "top":
                    if(count==0){
                        System.out.println(-1);
                        break;
                    }
                    else {
                        System.out.println(arrStack[count-1]);
                        break;
                    }
            }
        }

    }

}
