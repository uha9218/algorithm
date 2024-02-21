package easy;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MaxHip_11279 {

        private static int max_size;

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int max_size = Integer.parseInt(st.nextToken());

            PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

            //0이 들어왔을때
            // -> 큐가 비어있을때 : 0을 출력
            // -> 큐가 비어있지 않을때 : 큐.poll
            // 그 외 : 큐.add()
            for(int i=1; i<=max_size; i++) {
                st = new StringTokenizer(bf.readLine());

                int input = Integer.parseInt(st.nextToken());
                if(input == 0) {
                    if(heap.isEmpty()) System.out.println(0);
                    else               System.out.println(heap.poll());
                } else {
                    heap.add(input);
                }
            }
            bw.close();
        }
    }

