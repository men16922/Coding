package inflearn;

import java.util.Scanner;

public class p3_7 {
	
	public int solution(int n, int k, int [] arr) {
		int answer = 0, cnt = 0 , lt = 0; // cnt는 0을 1로 바꾼 횟수
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt ++;
			while(cnt > k) { // cnt 횟수가 정해진 횟수보다 크면 조정
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
	
		}
		return answer;
	}
	
	public static void main(String[] args) {
		p3_7 T = new p3_7();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}
