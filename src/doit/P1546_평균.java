package doit;

import java.util.Scanner;

/**
 * ���� �� �ִ밪�� ��� M�̶� �ϰ�, ��� ������ ����/M*100 ���� �Ѵ�. ���ο� ����� ���϶�.
 * 
 * @author men16
 *
 */

public class P1546_��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] grades = new int[N];
		long max = 0;
		long sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			grades[i] = sc.nextInt();
			max = max < grades[i] ? grades[i] : max;
			sum += grades[i];
		}
		
		/**
		 * ������ ������ ������ ����� �ʿ� ����, �� ���� ��ȯ�� ������ ��� ������ ���Ѵ�.
		 */
		float answer = (float) sum * 100 / max / N;
		System.out.println(answer);
	}
}
