package inflearn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 동전교환(냅색 알고리즘)
 * @author men16
 *
 */
public class p10_5 {

	static int n, m;
	static int [] dy;
	
	public int solution(int [] coin) {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i = 0; i< n; i++) {
			for(int j = coin[i]; j <= m; j++) { // coin의 금액에서 시작
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			} 
		}
		return dy[m];
	}
	
	public static void main(String[] args) {
		p10_5 T = new p10_5();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		m = kb.nextInt();
		dy = new int[m+1];
		System.out.println(T.solution(arr));
	}
}
