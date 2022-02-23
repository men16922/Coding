package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5_6 {
	/**
	 * Queue
	 * offer로 자료 넣고, poll로 꺼냄
	 * FIFO
	 */
	public int solution(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		int answer = 0;
		for(int i = 1; i <= n ; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i = 1; i < k; i++) { // k번째 전까지 poll해서 빼고 뒤에 다시 넣는다
				queue.offer(queue.poll()); 
			}
			queue.poll(); // k번째를 뺀다. 그리고 loop
			if(queue.size() == 1) answer = queue.poll(); // 마지막 1개 남으면 poll로 뺀다
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
