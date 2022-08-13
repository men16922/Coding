package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11286_������ {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> {
         int first_abs = Math.abs(o1);
         int second_abs = Math.abs(o2);

         if(first_abs == second_abs) {
             return o1 > o2 ? 1 : -1; // ������ ������ ���� �켱 ����
         } else {
             return first_abs - second_abs; // ������ �������� �����ϱ�
         }

       });

        for(int i =0; i < N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if(request == 0) {
                if(pQueue.isEmpty()) System.out.println(0);
                else System.out.println(pQueue.poll()); // ť�� front�� ���
            } else {
                pQueue.add(request);
            }
        }


    }
}
