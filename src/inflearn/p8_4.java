package inflearn;

import java.util.Scanner;

/**
 * �ߺ� ���� ���ϱ�
 * @author men16
 *
 */
public class p8_4 {
	static int [] pm;
	static int n, m;
	
	/**
	 * ���ʿ� stack�� D(0) ȣ��
	 * i�� 1~3 ȣ��
	 * pm[0] = 1, D(1) ȣ��
	 * i�� 1~3 ȣ��
	 * pm[1] = 1, D(2) ȣ��, ����Ǹ鼭 pop : 1 1
	 * pm[1] = 2, D(2) ȣ��, ����Ǹ鼭 pop : 1 2
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
