package bakjoon;

import java.util.Scanner;

public class p_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		
		int l = 0; // 왼쪽 수
		int r = 0; // 오른쪽 수

		int num = n;
		int cnt = 0;

		do { // 새로운 수가 n과 같을 때까지

			if (num < 10) {
				l = 0;
				r = num;
			} else {
				l = num / 10;
				r = num % 10;
			}
			num = r * 10 + (l + r)%10; // 새로운 수
			cnt++;
		} while (n != num);

		System.out.println(cnt);
	}
}
