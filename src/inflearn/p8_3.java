package inflearn;

import java.util.Scanner;

/**
 * 최대점수 구하기
 * @author men16
 *
 */
public class p8_3 {

	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;
	
	public void DFS(int L, int sum, int time, int [] ps, int [] pt) {
		if(time > m) { // 제한시간이 넘을경우
			return;
		}
		if(L == n) { // 부분집합 완성시
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt); // 풀 경우
			DFS(L+1, sum, time, ps, pt); // 안 풀고 넘어갈 경우
		}
	}
	
	
	
	public static void main(String[] args) {
		p8_3 T = new p8_3();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int [] a  = new int[n];
		int [] b  = new int[n];
		for(int i = 0 ; i < n; i++) {
			a[i] = kb.nextInt(); // 점수
			b[i] = kb.nextInt(); // 걸리는 시간
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
	
}
