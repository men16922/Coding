package doit.datastructure;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P11003_최솟값찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 숫자의 개수
        int L = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우의 개수

        st = new StringTokenizer(bf.readLine());
        Deque<Node> myDeque = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            int current = Integer.parseInt(st.nextToken()); // 새롭게 들어오는 값, 정렬하지 않고 현재 수보다 큰 값을 덱에서 제거

            // 덱이 비어있지 않고, 마지막 값이 현재 값보다 크면 마지막 값 제거
            while(!myDeque.isEmpty() && myDeque.getLast().value > current) {
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(current, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if(myDeque.getFirst().index <= i - L) {
                myDeque.removeFirst();
            }
            bw.write(myDeque.getFirst().value + " ");

        }
        bw.flush();
        bw.close();

    }

    static class Node {
        public int value;
        public int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}

