package inflearn;

import java.util.Scanner;

/**
 * 최대점수 구하기(냅색 알고리즘)
 * @author men16
 *
 */
public class p10_6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int [] dy = new int[m+1];
		
		for(int i = 0; i < n; i++) {
			int ps = kb.nextInt();
			int pt = kb.nextInt();
			
			for(int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt] + ps);
			}
		}
		System.out.println(dy[m]);
		
	}
}
