package doit.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_ī�� {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) { // ī�带 ť�� ����
            queue.add(i);
        }

        while(queue.size() > 1) { // ī�尡 1�� ���� ������
            queue.poll(); // �� ���� ī�带 ����
            queue.add(queue.poll()); // �� ���� ī�带 ���� �Ʒ� ī�� ������ �̵�
        }

        System.out.println(queue.peek());
    }
}
