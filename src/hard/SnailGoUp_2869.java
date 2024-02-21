package hard;

import java.util.Scanner;

public class SnailGoUp_2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();    //올라감
        int b = in.nextInt();    //내려감
        int v = in.nextInt();    //전체 높이
        int answer = 0;
        int tmp = (v-b)/(a-b);
        if((v-b)%(a-b)==0){answer = tmp;}
        else answer = tmp+1;
        System.out.println(answer);
    }
}
