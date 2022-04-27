package inflearn;

import java.util.Scanner;

/**
 * 돌다리 건너기
 * @author men16
 *
 */
public class p10_2 {

static int [] dy;
	
	/**
	 * n + 1 번쨰가 답
	 * @param n
	 * @return
	 */
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i<= n + 1; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		
		return dy[n + 1];
	}
	
	public static void main(String[] args) {
		p10_2 T = new p10_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int [n+2];
		System.out.println(T.solution(n));
	}
}
