package doit;

import java.util.Scanner;

/**
 * N���� �� A1, ... An�� �־����� �� ���ӵ� �κ��� ���� M���� ����������� ������ ������ ���϶�
 * 1 <= N <= 106, 2 <= M <= 103
 * @author men16
 *
 */
public class P10968_�������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long [] S = new long [N];
		long [] C = new long [N];
		long answer = 0;
		
		S[0] = sc.nextInt();
 		/**
		 * �� �迭 ���ϱ�
		 */
		for(int i = 1; i < N; i++) {
			S[i] = S[i - 1] + sc.nextInt();
		}
		
		/**
		 * �� �迭�� ��� �տ� % M ���ϱ�
		 */
		for(int i = 0; i < N; i++) {
			int remainder = (int) S[i] % M;
			if(remainder == 0) answer++;
			
			//�������� ���� �ε����� ���� ����
			C[remainder]++; 
		}
		
		for(int i = 0; i < M; i++) {
			if(C[i] > 1) {
				// �������� ���� �ε��� �� �� 2���� �̴� ����� ����
				answer += C[i] * (C[i] - 1) / 2;
			}
		}
		
		System.out.println(answer);
		
	}
}
