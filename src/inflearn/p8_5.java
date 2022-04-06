package inflearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * ������ȯ 
 * @author men16
 *
 */
public class p8_5 {
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer [] arr) {
		if(sum > m) {
			return;
		}
		if(L >= answer) return;
		if(sum == m) { // ���� �Ž��� �� �ݾװ� ������
			answer = Math.min(answer, L);
		} else {
			for(int i = 0; i < n; i++) {
				DFS(L+1, sum + arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		p8_5 T = new p8_5();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		Integer [] arr = new Integer [n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		
		Arrays.sort(arr, Collections.reverseOrder()); // ���� answer�� ���� ã�� ���� �������� ���� �����ϸ� �ӵ��� ������
		m = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
}
