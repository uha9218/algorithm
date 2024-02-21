package easy;

import java.io.*;
import java.util.PriorityQueue;

public class MinHip_1927 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(heap.isEmpty()){
                    bw.write(0+"\n");
                }else {
                    bw.write(heap.poll()+"\n");
                }
            }else{
                 heap.add(input);
            }
        }
        bw.close();
    }
}
