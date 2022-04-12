package inflearn;

import java.util.Scanner;

/**
 * 수열 추측하기
 * @author men16
 *
 */
public class p8_8 {
	static int [] b, p, ch;
	static int n, f;
	boolean flag = false;
	int [][] dy = new int[35][35];
	
	// b 배열에는 4일 경우 3c0 ~ 3c3까지 넣는다.
	// p 배열에는 index는 Level, value는 순열 값
	/*
	 * 만약 3 1 2 4의 순열이 있을 때
	이를 가지고 파스칼 삼각형을 구해보면 이런 식으로 전개됨.

	3	1	2	4
	(3+1) (1+2) (2+4)

   (3+1+1+2) (1+2+2+4)

    (3+1+1+2+1+2+2+4)
    
    3 : 1개
	1: 3개
	2: 3개
	4: 1개
	
	개수배열을 b라고 했을 때 1,3,3,1.
	각각의 숫자는 3C0 3C1 3C2 3C3의 값들임.
	
	따라서 최종 숫자인 f는 각 숫자와 조합 값을 곱한 값의 총합.
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
					ch[i] = 1; // i 자체가 순열의 숫자
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
