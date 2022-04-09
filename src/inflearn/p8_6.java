package inflearn;

import java.util.Scanner;

/**
 * ���� ���ϱ�
 * @author men16
 *
 */
public class p8_6 {

	static int [] pm, ch, arr;
	static int n, m;
	
	/**
	 * D(0)���� ����, ch �迭�� 0 0 0, pm�� �������
	 * ���� arr[0] ���, ch[0] = 1 (���) ǥ��, pm[0] = arr[0], D(1)�� �Ѿ
	 * ch[0]�� ��������Ƿ�, pm[1] = arr[1] ���, ch[1] = 1, D(2), stack���� pop
	 * D(1), i = 1���� ���ƿ�, ch[1] = 0 ���� �ǵ�����
	 * for���� ���� i = 2, ch[2] = 1, pm[1] = arr[2], D(2), stack���� pop
	 * D(1), i = 2 �� ���ƿ�, ch[2] = 0���� �ǵ���, stack���� pop
	 * D(0)���� �ǵ���, ch[0] = 0���� �ǵ���
	 * D(0)���� i = 1�� ����, 
	 * D(1), pm[0] = arr[1], D(2)�� �Ѿ�鼭 stack���� pop
	 * ...
	 * @param L
	 */
	public void DFS(int L) {
		if(L == m) { // ������ �������
			for(int x : pm) System.out.print(x + " ");
				System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) { // check�� i��° index�� ������ �ʾ��� ��
					ch[i] = 1;
					pm[L] = arr[i]; // ������ �� ����
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		p8_6 T = new p8_6();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0 ; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		
		T.DFS(0);
	}
}
