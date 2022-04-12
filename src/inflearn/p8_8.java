package inflearn;

import java.util.Scanner;

/**
 * ���� �����ϱ�
 * @author men16
 *
 */
public class p8_8 {
	static int [] b, p, ch;
	static int n, f;
	boolean flag = false;
	int [][] dy = new int[35][35];
	
	// b �迭���� 4�� ��� 3c0 ~ 3c3���� �ִ´�.
	// p �迭���� index�� Level, value�� ���� ��
	/*
	 * ���� 3 1 2 4�� ������ ���� ��
	�̸� ������ �Ľ�Į �ﰢ���� ���غ��� �̷� ������ ������.

	3	1	2	4
	(3+1) (1+2) (2+4)

   (3+1+1+2) (1+2+2+4)

    (3+1+1+2+1+2+2+4)
    
    3 : 1��
	1: 3��
	2: 3��
	4: 1��
	
	�����迭�� b��� ���� �� 1,3,3,1.
	������ ���ڴ� 3C0 3C1 3C2 3C3�� ������.
	
	���� ���� ������ f�� �� ���ڿ� ���� ���� ���� ���� ����.
	 */
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L==n) {
			if(sum == f) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
		} else {
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1; // i ��ü�� ������ ����
					p[L] = i;
					DFS(L+1, sum + (p[L] * b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_8 T = new p8_8();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int [n];
		p = new int [n];
		ch = new int [n+1];
		for(int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
		}
		T.DFS(0, 0);

	}
}
