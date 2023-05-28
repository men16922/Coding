package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11286_절댓값힙 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> {
         int first_abs = Math.abs(o1);
         int second_abs = Math.abs(o2);

         if(first_abs == second_abs) {
             return o1 > o2 ? 1 : -1; // 절댓값이 같으면 음수 우선 정렬
         } else {
             return first_abs - second_abs; // 절댓값을 기준으로 정렬하기
         }

       });

        for(int i =0; i < N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if(request == 0) {
                if(pQueue.isEmpty()) System.out.println(0);
                else System.out.println(pQueue.poll()); // 큐의 front값 출력
            } else {
                pQueue.add(request);
            }
        }


    }
}
