package bakjoon;

import java.util.Scanner;

public class p_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		
		int l = 0; // ���� ��
		int r = 0; // ������ ��

		int num = n;
		int cnt = 0;

		do { // ���ο� ���� n�� ���� ������

			if (num < 10) {
				l = 0;
				r = num;
			} else {
				l = num / 10;
				r = num % 10;
			}
			num = r * 10 + (l + r)%10; // ���ο� ��
			cnt++;
		} while (n != num);

		System.out.println(cnt);
	}
}
