package easy;

import java.io.*;
import java.util.StringTokenizer;

public class Queue_18258 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arrQueue = new int[n];
        int fron = 0;
        int rear = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();

            switch (input) {
                case "size":
                    bw.write(rear-fron+"\n");
                    break;
                case "push":
                    int tmp = Integer.parseInt(st.nextToken());
                    arrQueue[rear++] = tmp;
                    break;
                case "pop":
                    if (fron==rear) {
                        bw.write(-1+"\n");
                        break;
                    } else {
                        bw.write(arrQueue[fron++]+"\n");
                        break;
                    }
                case "empty":
                    if (fron==rear) {
                        bw.write(1+"\n");
                        break;
                    } else {
                        bw.write(0+"\n");
                        break;
                    }
                case "front":
                    if (fron==rear) {
                        bw.write(-1+"\n");
                        break;
                    } else {
                        bw.write(arrQueue[fron]+"\n");
                        break;
                    }
                case "back":
                    if (fron==rear) {
                        bw.write(-1+"\n");
                        break;
                    } else {
                        bw.write(arrQueue[rear-1]+"\n");
                        break;
                    }
            }
        }
        bw.close();
    }
}
