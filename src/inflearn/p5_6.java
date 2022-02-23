package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5_6 {
	/**
	 * Queue
	 * offer�� �ڷ� �ְ�, poll�� ����
	 * FIFO
	 */
	public int solution(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		int answer = 0;
		for(int i = 1; i <= n ; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i = 1; i < k; i++) { // k��° ������ poll�ؼ� ���� �ڿ� �ٽ� �ִ´�
				queue.offer(queue.poll()); 
			}
			queue.poll(); // k��°�� ����. �׸��� loop
			if(queue.size() == 1) answer = queue.poll(); // ������ 1�� ������ poll�� ����
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		p5_6 T = new p5_6();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(T.solution(n, k));
	}
}
