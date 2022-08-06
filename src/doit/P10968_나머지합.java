package doit;

import java.util.Scanner;

/**
 * N개의 수 A1, ... An이 주어졌을 떄 연속된 부분의 합이 M으로 나누어떨어지는 구간의 개수를 구하라
 * 1 <= N <= 106, 2 <= M <= 103
 * @author men16
 *
 */
public class P10968_나머지합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long [] S = new long [N];
		long [] C = new long [N];
		long answer = 0;
		
		S[0] = sc.nextInt();
 		/**
		 * 합 배열 구하기
		 */
		for(int i = 1; i < N; i++) {
			S[i] = S[i - 1] + sc.nextInt();
		}
		
		/**
		 * 합 배열의 모든 합에 % M 구하기
		 */
		for(int i = 0; i < N; i++) {
			int remainder = (int) S[i] % M;
			if(remainder == 0) answer++;
			
			//나머지가 같은 인덱스의 개수 세기
			C[remainder]++; 
		}
		
		for(int i = 0; i < M; i++) {
			if(C[i] > 1) {
				// 나머지가 같은 인덱스 중 총 2개를 뽑는 경우의 개수
				answer += C[i] * (C[i] - 1) / 2;
			}
		}
		
		System.out.println(answer);
		
	}
}
