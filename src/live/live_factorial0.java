package live;

import java.util.Scanner;

/**
 *  ���ڸ��� 0�� ������ ���� �����ΰ�? 
 *  2�� 5�� ������ ���� ����. �� ���� �Ųٷ� �����ڸ� ���μ����ظ� �ؼ�
 *  2�� 5�� ������ ��� ���ڸ��� 0���� �����ٴ� ���̴�.
 *  5�� n�¿� ���� ī��Ʈ ���� �� �� �� �߰�
 *  �ݺ����� ���� 5�� �����鼭 ������
 * @author men16
 *
 */
public class live_factorial0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int num = in.nextInt();
		int count = 0;
 
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
}
