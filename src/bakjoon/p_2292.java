package bakjoon;

import java.util.Scanner;

public class p_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 1; // ĭ��
		int range = 1; // ������ ����
		int m = 1; // 6�� ����� ���ϱ� ���� ���
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
