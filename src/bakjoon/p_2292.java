package bakjoon;

import java.util.Scanner;

public class p_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 1; // 칸수
		int range = 1; // 숫자의 범위
		int m = 1; // 6의 배수를 더하기 위해 사용
		while (true) {

			if (range >= n) {
				break;
			}

			m = 6 * (cnt++);
			range += m;
		}

		System.out.println(cnt);
	}
}
