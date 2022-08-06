package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하라 1 <= N <= 100,000 각 수는 <= 1000
 * 
 * @author men16
 *
 */
public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int N = Integer.parseInt(stringTokenizer.nextToken()); // 수의 개수
		int M = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야 하는 횟수
		long[] S = new long[N+1]; // 합 배열

		/**
		 * 합을 구해야 하는 횟수가 최대 100,000이므로 구간 합을 이용하여 시간 복잡도를 줄인다.
		 */
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <= N; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); 
		}
		
		for (int k = 0; k < M; k++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken()); 
			int j = Integer.parseInt(stringTokenizer.nextToken()); 
//			System.out.printf("%d %d \n", i, j);
//			System.out.printf("%d %d \n", S[j], S[i - 1]);
			System.out.println(S[j] - S[i - 1]);
		}
	}
}
