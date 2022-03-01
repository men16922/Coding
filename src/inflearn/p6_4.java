package inflearn;

import java.util.Scanner;

/**
 * LRU ���� ���� ���
 * 
 * @author men16
 *
 */
public class p6_4 {

	public int[] solution(int size, int n, int[] arr) {
		int [] cache = new int[size];
		for(int x : arr) {
			int pos = -1; // index ��ȣ. ��ġ
			for(int i = 0; i < size; i++) if(x == cache[i]) pos = i; // cache hit
			// hit�� ���� ��ȣ�� �ش� �������� ���ϰ�, �׷��� ������ miss�ϱ� -1
			if(pos == -1) {
				for(int i = size - 1; i >= 1; i--) {
					cache[i] = cache[i-1]; // i������ i-1������ ���� �����ش�.
				}
				cache[0] = x; // ���� ������ ���� 0��° index��
			} else {
				for(int i = pos; i >= 1; i--) { // hit�� ����
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			
		}

		return cache;
	}

	public static void main(String[] args) {
		p6_4 T = new p6_4();
		Scanner kb = new Scanner(System.in);

		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : T.solution(s, n, arr))
			System.out.print(x + " ");
	}
}
