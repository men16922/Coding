package inflearn;

import java.util.Scanner;

/**
 * 중복 순열 구하기
 * @author men16
 *
 */
public class p8_4 {
	static int [] pm;
	static int n, m;
	
	/**
	 * 최초에 stack에 D(0) 호출
	 * i가 1~3 호출
	 * pm[0] = 1, D(1) 호출
	 * i가 1~3 호출
	 * pm[1] = 1, D(2) 호출, 종료되면서 pop : 1 1
	 * pm[1] = 2, D(2) 호출, 종료되면서 pop : 1 2
	 * ...
	 * @param L
	 */
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
				System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}

	public static void main(String[] args) {
		p8_4 T = new p8_4();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}
