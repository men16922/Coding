package inflearn;

import java.util.Scanner;

/**
 * �ִ����� ���ϱ�
 * @author men16
 *
 */
public class p8_3 {

	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;
	
	public void DFS(int L, int sum, int time, int [] ps, int [] pt) {
		if(time > m) { // ���ѽð��� �������
			return;
		}
		if(L == n) { // �κ����� �ϼ���
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt); // Ǯ ���
			DFS(L+1, sum, time, ps, pt); // �� Ǯ�� �Ѿ ���
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
			a[i] = kb.nextInt(); // ����
			b[i] = kb.nextInt(); // �ɸ��� �ð�
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
	
}
