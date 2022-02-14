package inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * TreeSet : 중복제거, 정렬
 * @author men16
 *
 */
public class p4_5 {
	
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		//삼중 for문
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
//		Tset.remove(143);
//		Tset.size();
//		Tset.first(); // 첫번째값. 오름차순, 내림차순에 따라 최소 또는 최대값
//		Tset.last(); // 마지막값. 오름차순, 내림차순에 따라 최소 또는 최대값
		int cnt = 0;
		for(int x : Tset) {
			cnt ++;
			if(cnt == k) return x;

		}
		
		return answer;
	}

	public static void main(String[] args) {
		p4_5 T = new p4_5();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
