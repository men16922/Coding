package inflearn;

import java.util.Scanner;

/**
 * LRU 삽입 정렬 사용
 * 
 * @author men16
 *
 */
public class p6_4 {

	public int[] solution(int size, int n, int[] arr) {
		int [] cache = new int[size];
		for(int x : arr) {
			int pos = -1; // index 번호. 위치
			for(int i = 0; i < size; i++) if(x == cache[i]) pos = i; // cache hit
			// hit면 현재 번호가 해당 지점으로 변하고, 그렇지 않으면 miss니까 -1
			if(pos == -1) {
				for(int i = size - 1; i >= 1; i--) {
					cache[i] = cache[i-1]; // i지점에 i-1지점의 값을 땡겨준다.
				}
				cache[0] = x; // 새로 들어오는 값을 0번째 index로
			} else {
				for(int i = pos; i >= 1; i--) { // hit일 때는
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
