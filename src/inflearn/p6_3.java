package inflearn;

import java.util.Scanner;

/**
 * ���� ����
 * @author men16
 *
 */
public class p6_3 {
	
	public int [] solution(int n, int [] arr) {
		
		for(int i = 1; i < n; i++) { 
			int tmp = arr[i]; // i���� 
			int j;
			for(j = i - 1; j >= 0 && arr[j] > tmp; j--) { // i��°���� �����ؼ�, 0��° index���� loop
				arr[j+1] = arr[j]; // ���� j��° ���ڰ� tmp���� ũ��, j+1��°�� j��° ���ڸ� �ִ´�
			}
			arr[j+1] = tmp; // j�� ���� ������ + 1 �������� tmp�� �ִ´�.
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		p6_3 T = new p6_3();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
