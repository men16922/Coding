package inflearn;

import java.util.Scanner;

/**
 * ������ ���Ϸ���(DFS)
 * @author men16
 *
 */
public class p8_13 {
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // �밢�� ���� 8����
	static int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int answer = 0, n;
	
	/**
	 * 8���� ���鼭 1�ΰ� 0���� �ٲ���
	 * @param x
	 * @param y
	 * @param board
	 */
	public void DFS(int x, int y, int [][] board) {
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny <n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}

	
	public void solution(int [][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) { // ���� ��ġ(1) �̸�
					answer++; // ���� ����
					board[i][j] = 0; // ������� 0���� �ٲ㼭 �ѱ��
					DFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_13 T = new p8_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		T.solution(arr);
		System.out.println(answer);
	}
}
