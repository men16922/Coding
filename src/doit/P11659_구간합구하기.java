package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * �� N���� �־����� �� i��° ������ j��° �������� ���� ���϶� 1 <= N <= 100,000 �� ���� <= 1000
 * 
 * @author men16
 *
 */
public class P11659_�����ձ��ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int N = Integer.parseInt(stringTokenizer.nextToken()); // ���� ����
		int M = Integer.parseInt(stringTokenizer.nextToken()); // ���� ���ؾ� �ϴ� Ƚ��
		long[] S = new long[N+1]; // �� �迭

		/**
		 * ���� ���ؾ� �ϴ� Ƚ���� �ִ� 100,000�̹Ƿ� ���� ���� �̿��Ͽ� �ð� ���⵵�� ���δ�.
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
