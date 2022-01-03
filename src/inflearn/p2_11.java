package inflearn;

import java.util.Scanner;

public class p2_11 {

	public int solution(int n, int [][] arr) {
		int answer = 0, max= Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			int cnt =  0;
			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <=5; k++) { // �г� 
					if(arr[i][k] == arr[j][k]) { // i�� �л��� k�г� �ݰ� j�� �л��� k�г� ���� ������ 
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i; // i�� �л�
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		p2_11 p = new p2_11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[][] arr = new int[n + 1][6]; // n�� 2���� ���� ����ϹǷ� n + 1
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(p.solution(n, arr));
	}
}
