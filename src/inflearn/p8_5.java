package inflearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전교환 
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
		if(sum == m) { // 합이 거슬러 줄 금액과 같으면
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
		
		Arrays.sort(arr, Collections.reverseOrder()); // 작은 answer를 빨리 찾기 위해 내림차순 먼저 정렬하면 속도가 빨라짐
		m = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
}
