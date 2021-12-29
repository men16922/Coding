package bakjoon;

import java.util.Scanner;


/**
 * n보다 작은 등차수열의 개수를 구한다
 * a의 n번쨰 항 = a의 첫번째 항 + (n-1) * d(연속하는 항의 차이)
 * 
 * 1~99는 등차 수열
 * 1~9는 등차 수열
 * 10~99는 각 자리수의 차가 공차
 * 100보다 작은 수와, 100보다 큰 수의 케이스
 * @author men16
 *
 */
public class p_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(d(n));
        sc.close();
	}
	
	public static int d(int n) {
		int cnt = 0;
		if(n < 100) {
			return n;
		}
		else {
			cnt = 99;
			if(n == 1000) {
				n = 999; // 1000은 예외처리
			}
			
			for(int i = 100; i <= n; i++) {
				int hun = i / 100; // 백의 자리수
				int ten = (i / 10) % 10; // 십의 자리수
				int one = i % 10; // 일의 자리수
				if((hun - ten) == (ten - one)) // 각 자리수가 등차수열을 이루면 {
					cnt++;
			}
			
			
		}
		
		return cnt;
	}
}