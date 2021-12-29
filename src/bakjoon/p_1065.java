package bakjoon;

import java.util.Scanner;


/**
 * n���� ���� ���������� ������ ���Ѵ�
 * a�� n���� �� = a�� ù��° �� + (n-1) * d(�����ϴ� ���� ����)
 * 
 * 1~99�� ���� ����
 * 1~9�� ���� ����
 * 10~99�� �� �ڸ����� ���� ����
 * 100���� ���� ����, 100���� ū ���� ���̽�
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
				n = 999; // 1000�� ����ó��
			}
			
			for(int i = 100; i <= n; i++) {
				int hun = i / 100; // ���� �ڸ���
				int ten = (i / 10) % 10; // ���� �ڸ���
				int one = i % 10; // ���� �ڸ���
				if((hun - ten) == (ten - one)) // �� �ڸ����� ���������� �̷�� {
					cnt++;
			}
			
			
		}
		
		return cnt;
	}
}