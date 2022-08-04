package doit.datastructure;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P11003_�ּڰ�ã�� {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // ����� ���ۿ� �ְ� �� ���� ����ϱ� ���� BufferedWriter ���
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // ������ ����
        int L = Integer.parseInt(st.nextToken()); // �����̵� �������� ����

        st = new StringTokenizer(bf.readLine());
        Deque<Node> myDeque = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            int current = Integer.parseInt(st.nextToken()); // ���Ӱ� ������ ��, �������� �ʰ� ���� ������ ū ���� ������ ����

            // ���� ������� �ʰ�, ������ ���� ���� ������ ũ�� ������ �� ����
            while(!myDeque.isEmpty() && myDeque.getLast().value > current) {
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(current, i));
            // �������� ��� ���� ������ ����
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

